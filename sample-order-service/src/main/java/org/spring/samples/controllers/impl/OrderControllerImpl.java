package org.spring.samples.controllers.impl;

import org.spring.samples.controllers.OrderController;
import org.spring.samples.models.OrderRequest;
import org.spring.samples.models.OrderResponse;
import org.spring.samples.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for @{@link OrderController} interface.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
@RestController
@RequestMapping("order")
public class OrderControllerImpl implements OrderController {

    @Autowired
    OrderService orderService;

    public ResponseEntity<OrderResponse> processOrder(@RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok(orderService.processOrder(orderRequest));
    }

}
