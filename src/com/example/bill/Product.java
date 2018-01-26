package com.example.bill;

/**
 * This interface implements Bill of any product.
 * 
 * @author Muhammad Ali Qasmi
 * 
 */
public interface Product {
   /**
    * Returns name/id of item
    *  
    * @return Item name
    */
   String getItem();
   
   /**
    *Returns the price of item
    *
    * @return Item price
    */
   float getPrice();
   /**
    * 
    * @return 
    */
    int getQuantity();
}
