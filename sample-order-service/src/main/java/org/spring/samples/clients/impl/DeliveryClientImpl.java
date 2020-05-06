package org.spring.samples.clients.impl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.spring.samples.clients.DeliveryClient;
import org.spring.samples.models.DeliveryRequest;
import org.spring.samples.models.DeliveryResponse;
import org.spring.samples.models.OrderRequest;
import org.spring.samples.models.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Implementation class for {@link DeliveryClient}.
 * It uses spring rest template to consume the service.
 * This class also uses Resilience4j circuit breaker implementation for resilience.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
@Service
public class DeliveryClientImpl implements DeliveryClient {

    @Autowired
    RestTemplate restTemplate;

    private static final String URL_FOR_DELIVERY_SERVICE = "http://localhost:8080/delivery";

    @Override
    @CircuitBreaker(name = "scheduleDelivery", fallbackMethod = "fallbackForScheduleDelivery")
    public String scheduleDelivery(OrderRequest orderRequest) {
        DeliveryRequest deliveryRequest = new DeliveryRequest(orderRequest.getOrderId(),
                orderRequest.getItems(),
                orderRequest.getDeliveryDate(),
                orderRequest.getAddress());
        DeliveryResponse deliveryResponse = restTemplate.postForObject(URL_FOR_DELIVERY_SERVICE,
                deliveryRequest,
                DeliveryResponse.class);
        return deliveryResponse.getDeliveryRequestStatus();
    }

    private String fallbackForScheduleDelivery(OrderRequest orderRequest, Throwable t) {
        t.printStackTrace(System.out);
        System.out.println("fallback called devlivery");
        return OrderStatus.DELIVERY_TO_BE_SCHEDULED.getOrderStatus();
    }
}
