package org.spring.samples.services;

import org.spring.samples.models.OrderRequest;
import org.spring.samples.models.OrderResponse;

/**
 * Interface for the order related services.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public interface OrderService {

    OrderResponse processOrder(OrderRequest orderRequest);

}
