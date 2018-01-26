package com.example.bill;

import com.simple.calculator.SimpleCalculator;
import com.simple.calculator.SimpleCalculatorImpl;

/**
 * This class implements Billing using {@link Product}. 
 * 
 * @author Muhammad Ali Qasmi
 *
 */
public class ProductImpl implements Product {
    
    private String itemName;
    private float itemPrice;
    private int itemQuantity;
  
    private String madeIn;
    
    /**
     * This is the basic constructor for {@link ProductImpl} 
     * @param itemName Name of item
     * @param itemPrice Price of item
     */
    public ProductImpl(String itemName, //
            float itemPrice, //
            int itemQuantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity= itemQuantity;
       
    }
    
    @Override
    public String getItem() {
        return this.itemName;
    }

    @Override
    public float getPrice() {
        return this.itemPrice;
    }
    
     @Override
    public int getQuantity() {
       return this.itemQuantity;
    }
     
    /**
     * @return the madeIn
     */
    public final String getMadeIn() {
        return madeIn;
    }
    
    /**
     * @param madeIn the madeIn to set
     */
    public final void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

   

}
