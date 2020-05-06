package org.spring.samples.clients;

import org.spring.samples.models.OrderRequest;

/**
 * Client interface to consume the payment service.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public interface PaymentClient {

    String processPayment(OrderRequest orderRequest);

}
