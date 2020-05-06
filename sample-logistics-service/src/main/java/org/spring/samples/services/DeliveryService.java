package org.spring.samples.services;

import org.spring.samples.models.DeliveryRequest;
import org.spring.samples.models.DeliveryResponse;

/**
 * Interface for the delivery related services.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public interface DeliveryService {

    DeliveryResponse processDeliveryRequest(DeliveryRequest deliveryRequest);

}
