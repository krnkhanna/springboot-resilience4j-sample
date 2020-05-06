package org.spring.samples.models;

/**
 * Enum to list all the possible status of payment request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/6/2020
 */
public enum PaymentStatus {

    SUCCESSFUL("Successful"),
    FAILED("Failed");

    private final String paymentStatus;

    PaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

}
