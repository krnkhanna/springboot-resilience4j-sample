package org.spring.samples.models;

/**
 * Model class to represent items in an order.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 5/5/2020
 */
public class Item {

    private final String itemId;

    private final int quantity;

    public Item(String itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }
}
