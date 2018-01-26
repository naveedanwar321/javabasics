/**
 * 
 */
package com.example.bill;

import java.util.List;

import com.simple.calculator.SimpleCalculator;
import com.simple.calculator.SimpleCalculatorImpl;

/**
 * 
 * @author ENGINEERS
 */
public class BillImpl implements Bill {

    private List<Product> products;
    
    public BillImpl(List<Product> products){
        this.products = products;
    }
    
    /* (non-Javadoc)
     * @see com.example.bill.Bill#getPrice()
     */
    @Override
    public float getPrice() {
        float totalPrice = 0;
        for(int i=0; i < this.products.size(); i++){
            Product tmpProduct = this.products.get(i);
            float tmpProductPrice = tmpProduct.getPrice() * tmpProduct.getQuantity();
            SimpleCalculator simpleCalculator = new SimpleCalculatorImpl();
            totalPrice = simpleCalculator.addTwoNumbers((int)totalPrice, (int)tmpProductPrice);
        }
        return totalPrice;
    }
    
    @Override
    public int getQuantity() {
        int totalQuantity = 0;
        for(int i=0; i < this.products.size(); i++){
            Product tmpProduct = this.products.get(i);
            float tmpQuantity = tmpProduct.getQuantity();
            SimpleCalculator simpleCalculator = new SimpleCalculatorImpl();
            totalQuantity = simpleCalculator.addTwoNumbers((int)totalQuantity, (int)tmpQuantity);
        }
        return totalQuantity;
    }

    
    /**
     * @return the product
     */
    

    @Override
    public float productTax() {
        float tax = (getPrice()/100)*3;
        return tax;
        
    }

      public final List<Product> getProducts() {
        return products;
    }

}
