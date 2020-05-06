package org.spring.samples.controllers;

import org.spring.samples.models.PaymentRequest;
import org.spring.samples.models.PaymentResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Controller interface for the payment related rest end-points.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public interface PaymentController {

    @PostMapping
    ResponseEntity<PaymentResponse> processPaymentRequest(@RequestBody PaymentRequest paymentRequest);

}
