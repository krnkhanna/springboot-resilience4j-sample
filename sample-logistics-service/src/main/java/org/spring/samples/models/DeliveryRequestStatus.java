package org.spring.samples.models;

/**
 * Enum to list all the possible status of a delivery request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public enum DeliveryRequestStatus {

    SCHEDULED("Scheduled"),
    FAILED("Failed");

    private final String deliveryRequestStatus;

    DeliveryRequestStatus(String deliveryRequestStatus) {
        this.deliveryRequestStatus = deliveryRequestStatus;
    }

    public String getDeliveryRequestStatus() {
        return this.deliveryRequestStatus;
    }
}
