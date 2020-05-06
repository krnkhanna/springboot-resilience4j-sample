package org.spring.samples.models;

/**
 * Model class to represent the response for a payment request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public class PaymentResponse {

    private String orderId;

    private String transactionId;

    private String paymentStatus;

    public PaymentResponse() {

    }

    public PaymentResponse(String orderId, String transactionId, PaymentStatus paymentStatus) {
        this.orderId = orderId;
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus.getPaymentStatus();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
