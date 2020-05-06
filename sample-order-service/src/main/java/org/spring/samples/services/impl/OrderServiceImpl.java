package org.spring.samples.services.impl;

import org.spring.samples.clients.DeliveryClient;
import org.spring.samples.clients.PaymentClient;
import org.spring.samples.models.OrderRequest;
import org.spring.samples.models.OrderResponse;
import org.spring.samples.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation class for @{@link OrderService}
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    DeliveryClient deliveryClient;

    @Autowired
    PaymentClient paymentClient;


    public OrderResponse processOrder(OrderRequest orderRequest) {
        String paymentResponse = paymentClient.processPayment(orderRequest);
        String deliveryResponse = deliveryClient.scheduleDelivery(orderRequest);
        return new OrderResponse(orderRequest.getOrderId(), paymentResponse, deliveryResponse);
    }
}
