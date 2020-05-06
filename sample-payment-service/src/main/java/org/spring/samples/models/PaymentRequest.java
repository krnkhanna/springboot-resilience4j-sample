package org.spring.samples.models;

/**
 * Model class to represent a payment request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public class PaymentRequest {

    private String orderId;

    private double orderAmount;

    public PaymentRequest() {

    }

    public PaymentRequest(String orderId, double orderAmount) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
