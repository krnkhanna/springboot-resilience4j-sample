package org.spring.samples.clients;

import org.spring.samples.models.OrderRequest;

/**
 * Client interface to consume the delivery service.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public interface DeliveryClient {

    String scheduleDelivery(OrderRequest orderRequest);

}
