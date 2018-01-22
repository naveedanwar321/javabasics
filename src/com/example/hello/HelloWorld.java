package com.example.hello;

/**
 * This is my hello world inteface. It implements my first java program.
 * 
 * @author Muhammad Ali Qasmi
 * 
 */
public interface HelloWorld {
    /**
     * It prints my name.
     */
    void printMyName();
    
    /**
     * It add two numbers
     * @param x first number
     * @param y second number
     * @return total
     */
    int addTwoNumbers(int x, int y);
    /**
     * It add two numbers
     * @param x first number
     * @param y second number
     * @return total
     */
    float addTwoFloatNumbers(float x, float y); // Method Overload
    
    /**
     * It returns full name 
     * @param firstName first name
     * @param secondName second name
     * @return full name
     */
    String getFullName(String firstName, String secondName);
}
