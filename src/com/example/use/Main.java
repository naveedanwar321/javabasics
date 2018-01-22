/**
 * 
 */
package com.example.use;

import com.example.hello.HelloWorld;
import com.example.hello.HelloWorldImpl;

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
    }

}
