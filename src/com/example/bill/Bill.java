package com.example.bill;

/**
 * 
 * @author Muhammad Ali Qasmi
 * 
 */
public interface Bill {
    /**
     * Returns quantity of item
     * 
     * @return Item Quantity
     */
    int getQuantity();
    /**
     * Returns Price of item
     * @return Item Price
     */
    float getPrice();
    /**
     * Returns the Tax on a product.
     * @return Item Tax.
     */
    float productTax();
}
