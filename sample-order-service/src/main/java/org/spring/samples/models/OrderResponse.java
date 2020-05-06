package org.spring.samples.models;

/**
 * Model class to represent the response for an order request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public class OrderResponse {

    private String orderId;

    private String paymentResponse;

    private String deliveryResponse;

    public OrderResponse() {

    }

    public OrderResponse(String orderId, String paymentResponse, String deliveryResponse) {
        this.orderId = orderId;
        this.paymentResponse = paymentResponse;
        this.deliveryResponse = deliveryResponse;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentResponse() {
        return paymentResponse;
    }

    public void setPaymentResponse(String paymentResponse) {
        this.paymentResponse = paymentResponse;
    }

    public String getDeliveryResponse() {
        return deliveryResponse;
    }

    public void setDeliveryResponse(String deliveryResponse) {
        this.deliveryResponse = deliveryResponse;
    }
}
