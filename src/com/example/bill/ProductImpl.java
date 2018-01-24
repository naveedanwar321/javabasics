package com.example.bill;

/**
 * This class implements Billing using {@link Product}. 
 * 
 * @author Muhammad Ali Qasmi
 *
 */
public class ProductImpl implements Product {
    
    private String itemName;
    private float itemPrice;
    
    private String madeIn;
    
    /**
     * This is the basic constructor for {@link ProductImpl} 
     * @param itemName Name of item
     * @param itemPrice Price of item
     */
    public ProductImpl(String itemName, //
            float itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    
    @Override
    public String getItem() {
        return this.itemName;
    }

    @Override
    public float getPrice() {
        return this.itemPrice;
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
