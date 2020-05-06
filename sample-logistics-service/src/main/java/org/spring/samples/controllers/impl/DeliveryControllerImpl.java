package org.spring.samples.controllers.impl;

import org.spring.samples.controllers.DeliveryController;
import org.spring.samples.models.DeliveryRequest;
import org.spring.samples.models.DeliveryResponse;
import org.spring.samples.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for the {@link DeliveryController} interface.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
@RestController
@RequestMapping("delivery")
public class DeliveryControllerImpl implements DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @Override
    public ResponseEntity<DeliveryResponse> processDeliveryRequest(DeliveryRequest deliveryRequest) {
        return ResponseEntity.ok(deliveryService.processDeliveryRequest(deliveryRequest));
    }
}
