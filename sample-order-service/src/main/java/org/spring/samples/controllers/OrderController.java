package org.spring.samples.controllers;

import org.spring.samples.models.OrderRequest;
import org.spring.samples.models.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Controller interface for the order related rest end-points.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public interface OrderController {

    @PostMapping
    ResponseEntity<OrderResponse> processOrder(@RequestBody OrderRequest orderRequest);

}
