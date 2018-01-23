/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.simple.calculator;
/**
 *This is our First Arithmetic Calculator. It solves my all simple arithmetic calculations.
 * @author ENGINEERS
 */
public interface SimpleCalculator {
    /**
     * This Method is used for Adding two numbers.
     * @param x is first number
     * @param y is second number
     * @return total
     */
    int addTwoNumbers(int x, int y);
      /**
     * This Method is used for Subtract two numbers.
     * @param x is first number
     * @param y is second number
     * @return total
     */
    int subtractTwoNumbers(int x, int y);
      /**
     * This Method is used for Multiply two numbers.
     * @param x is first number
     * @param y is second number
     * @return total
     */
    int multiplyTwoNumbers(int x, int y);
      /**
     * This Method is used for Divide two numbers.
     * @param x is first number
     * @param y is second number
     * @return total
     */
    int divideTwoNumbers(int x, int y);
}
 