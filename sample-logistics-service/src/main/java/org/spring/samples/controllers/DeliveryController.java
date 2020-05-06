package org.spring.samples.controllers;

import org.spring.samples.models.DeliveryRequest;
import org.spring.samples.models.DeliveryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Controller interface for the delivery related rest end-points.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public interface DeliveryController {

    @PostMapping
    ResponseEntity<DeliveryResponse> processDeliveryRequest(@RequestBody DeliveryRequest deliveryRequest);
}
