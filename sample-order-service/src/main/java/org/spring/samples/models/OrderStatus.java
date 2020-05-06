package org.spring.samples.models;

/**
 * Enum to list all the possible status of an order placement.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public enum OrderStatus {

    SUCCESS("Success"),
    DELIVERY_TO_BE_SCHEDULED("Delivery to be scheduled"),
    PAYMENT_PENDING("Payment-Pending"),
    FAILED("Failed");

    private final String orderStatus;

    OrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

}
