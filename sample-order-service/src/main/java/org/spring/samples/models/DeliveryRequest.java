package org.spring.samples.models;

import java.util.Date;
import java.util.List;

/**
 * Model class to represent a delivery request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public class DeliveryRequest {

    private String orderId;

    private List<Item> items;

    private Date deliveryDate;

    private String address;

    public DeliveryRequest() {

    }

    public DeliveryRequest(String orderId, List<Item> items, Date deliveryDate, String address) {
        this.orderId = orderId;
        this.items = items;
        this.deliveryDate = deliveryDate;
        this.address = address;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
