package org.spring.samples.models;

/**
 * Model class to represent the response for a delivery request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public class DeliveryResponse {

    private String orderId;

    private String deliveryRequestStatus;

    public DeliveryResponse() {

    }

    public DeliveryResponse(String orderId, DeliveryRequestStatus deliveryRequestStatus) {
        this.orderId = orderId;
        this.deliveryRequestStatus = deliveryRequestStatus.getDeliveryRequestStatus();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryRequestStatus() {
        return deliveryRequestStatus;
    }

    public void setDeliveryRequestStatus(String deliveryRequestStatus) {
        this.deliveryRequestStatus = deliveryRequestStatus;
    }
}