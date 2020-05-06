package org.spring.samples.models;

import java.util.Date;
import java.util.List;

/**
 * Model class to represent an order request.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public class OrderRequest {

    private String orderId;

    private Date deliveryDate;

    private String address;

    private List<Item> items;

    private double orderAmount;

    public OrderRequest() {

    }

    public OrderRequest(String orderId, Date deliveryDate, String address, List<Item> items, double orderAmount) {
        this.orderId = orderId;
        this.deliveryDate = deliveryDate;
        this.address = address;
        this.items = items;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
