/**
 * 
 */
package com.example.bill;

import java.util.List;

import com.simple.calculator.SimpleCalculator;
import com.simple.calculator.SimpleCalculatorImpl;

/**
 * @author Muhammad Ali Qasmi
 *
 */
public class BillImpl implements Bill {

    private List<Product> products;
    
    public BillImpl(List<Product> products){
        this.products = products;
    }
    
    /* (non-Javadoc)
     * @see com.example.bill.Bill#getQuantity()
     */
    @Override
    public int getQuantity() {
        return this.products.size();
    }

    /* (non-Javadoc)
     * @see com.example.bill.Bill#getPrice()
     */
    @Override
    public float getPrice() {
        float totalPrice = 0;
        for(int i=0; i < this.products.size(); i++){
            Product tmpProduct = this.products.get(i);
            float tmpProductPrice = tmpProduct.getPrice();
            SimpleCalculator simpleCalculator = new SimpleCalculatorImpl();
            totalPrice = simpleCalculator.addTwoNumbers((int)totalPrice, (int)tmpProductPrice);
        }
        return totalPrice;
    }
    
    /**
     * @return the product
     */
    public final List<Product> getProducts() {
        return products;
    }

}
