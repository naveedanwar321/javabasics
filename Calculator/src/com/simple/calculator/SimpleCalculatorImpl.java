/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.calculator;

/**
 *
 * @author ENGINEERS
 */
public class SimpleCalculatorImpl implements SimpleCalculator {

    @Override
 
    public int addTwoNumbers(int x, int y) {
    int z = x+y;
    return z;
    }

    @Override
    public int subtractTwoNumbers(int x, int y) {
        int z = x-y;
    return z;
    }

    @Override
    public int multiplyTwoNumbers(int x, int y) {
        int z = x*y;
    return z;
    }

    @Override
    public int divideTwoNumbers(int x, int y) {
       int z = x/y;
    return z;
    }
    
}
