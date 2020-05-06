package org.spring.samples.services;

import org.spring.samples.models.PaymentRequest;
import org.spring.samples.models.PaymentResponse;

/**
 * Interface for the payment related services.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/6/2020
 */
public interface PaymentService {

    PaymentResponse processPayment(PaymentRequest paymentRequest);

}
