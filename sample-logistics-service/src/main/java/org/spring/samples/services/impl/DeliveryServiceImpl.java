package org.spring.samples.services.impl;

import org.spring.samples.models.DeliveryRequest;
import org.spring.samples.models.DeliveryResponse;
import org.spring.samples.models.DeliveryRequestStatus;
import org.spring.samples.services.DeliveryService;
import org.springframework.stereotype.Service;

/**
 * Implementation class for @{@link DeliveryService}
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Override
    public DeliveryResponse processDeliveryRequest(DeliveryRequest deliveryRequest) {
        return new DeliveryResponse(deliveryRequest.getOrderId(),
                DeliveryRequestStatus.SCHEDULED);
    }

}
