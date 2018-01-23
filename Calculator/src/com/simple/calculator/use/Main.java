/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.calculator.use;

import com.simple.calculator.SimpleCalculator;
import com.simple.calculator.SimpleCalculatorImpl;

/**
 *
 * @author ENGINEERS
 */
public class Main {
    public static void main(String[] args) {
        SimpleCalculator myObject= new SimpleCalculatorImpl();
        
        int n = myObject.addTwoNumbers(1, 3);
        System.out.println(n);
        
        int m = myObject.subtractTwoNumbers(1, 3);
        System.out.println(m);
        
        int o = myObject.multiplyTwoNumbers(1, 3);
        System.out.println(o);
        
        int p = myObject.divideTwoNumbers(3, 4);
        System.out.println(p);
    }
     
}
