package org.spring.samples.models;

/**
 * Model class to represent items in an order.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/4/2020
 */
public class Item {

    private String itemId;

    private int quantity;

    public Item() {

    }

    public Item(String itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
