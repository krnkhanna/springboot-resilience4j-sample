package org.spring.samples.controllers.impl;

import org.spring.samples.controllers.PaymentController;
import org.spring.samples.models.PaymentRequest;
import org.spring.samples.models.PaymentResponse;
import org.spring.samples.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for @{@link PaymentController} interface.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
@RestController
@RequestMapping("payment")
public class PaymentControllerImpl implements PaymentController {

    @Autowired
    PaymentService paymentService;


    public ResponseEntity<PaymentResponse> processPaymentRequest(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentService.processPayment(paymentRequest));
    }

}
