/**
 * 
 */
package com.example.use;

import java.util.List;
import java.util.ArrayList;

import com.example.bill.Bill;
import com.example.bill.BillImpl;
import com.example.bill.Product;
import com.example.bill.ProductImpl;
import com.example.hello.HelloWorld;
import com.example.hello.HelloWorldImpl;
import com.simple.calculator.SimpleCalculator;
import com.simple.calculator.SimpleCalculatorImpl;

/**
 * 
 * @author Muhammad Ali Qasmi
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Class Work - 22th Jan 2018
        
        HelloWorld myObject = new HelloWorldImpl();
        
        myObject.printMyName();
        
        int a = 1;
        int b = 2;
        int abc = myObject.addTwoNumbers(a, b);
        System.out.println(abc);
        
        float x = 3;
        float y = 2;
        float z = myObject.addTwoFloatNumbers(3.0f,2.0f);
       
        System.out.println(z);
        
        String firstName = "Muhammad Ali";
        String lastName = "Qasmi";
        
        String fullName = myObject.getFullName(firstName, lastName);
        System.out.println(fullName);
                
        
        // Home Work - 22th Jan 2018
        
        SimpleCalculator simpleCalculator = new SimpleCalculatorImpl();
        
        int n = simpleCalculator.addTwoNumbers(1, 3);
        System.out.println(n);
        
        int m = simpleCalculator.subtractTwoNumbers(1, 3);
        System.out.println(m);
        
        int o = simpleCalculator.multiplyTwoNumbers(1, 3);
        System.out.println(o);
        
        int p = simpleCalculator.divideTwoNumbers(3, 4);
        System.out.println(p);
        
        // Class Work - 24th Jan 2018
        Product product = new ProductImpl("Remote",4.5f);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());
        
        Product product2 = new ProductImpl("Laptop",4004.5f);
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
        
        List<Product> products = new ArrayList<Product>();
        products.add(product);
        products.add(product2);
        
        Bill bill = new BillImpl(products);
        System.out.println(bill.getQuantity());
        System.out.println(bill.getPrice());
        
    }

}
