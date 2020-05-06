package org.spring.samples.clients.impl;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.spring.samples.clients.PaymentClient;
import org.spring.samples.models.DeliveryRequest;
import org.spring.samples.models.DeliveryResponse;
import org.spring.samples.models.OrderRequest;
import org.spring.samples.models.OrderStatus;
import org.spring.samples.models.PaymentRequest;
import org.spring.samples.models.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Implementation class for {@link PaymentClient}.
 * It uses spring rest template to consume the service.
 * This class also uses Resilience4j circuit breaker implementation for resilience.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
@Service
public class PaymentClientImpl implements PaymentClient {

    @Autowired
    RestTemplate restTemplate;

    private static final String URL_FOR_PAYMENT_SERVICE = "http://localhost:7070/payment";

    @Override
    @CircuitBreaker(name = "payment", fallbackMethod = "fallbackForProcessPayment")
    public String processPayment(OrderRequest orderRequest) {
        PaymentRequest paymentRequest = new PaymentRequest(orderRequest.getOrderId(),
                orderRequest.getOrderAmount());
        PaymentResponse paymentResponse = restTemplate.postForObject(URL_FOR_PAYMENT_SERVICE,
                paymentRequest,
                PaymentResponse.class);
        return paymentResponse.getPaymentStatus();
    }

    private String fallbackForProcessPayment(OrderRequest orderRequest, Throwable t) {
        t.printStackTrace(System.out);
        System.out.println("fallback called payment");
        return OrderStatus.PAYMENT_PENDING.getOrderStatus();
    }

}
