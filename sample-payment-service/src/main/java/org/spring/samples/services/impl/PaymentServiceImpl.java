package org.spring.samples.services.impl;

import java.util.UUID;
import org.spring.samples.models.PaymentRequest;
import org.spring.samples.models.PaymentResponse;
import org.spring.samples.models.PaymentStatus;
import org.spring.samples.services.PaymentService;
import org.springframework.stereotype.Service;

/**
 * Implementation class for @{@link PaymentService} interface.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/6/2020
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        return new PaymentResponse(paymentRequest.getOrderId(),
                UUID.randomUUID().toString(),
                PaymentStatus.SUCCESSFUL);
    }

}
