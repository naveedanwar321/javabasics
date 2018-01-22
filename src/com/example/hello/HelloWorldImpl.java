/**
 * 
 */
package com.example.hello;


/**
 * @author Muhammad Ali Qasmi
 *
 */
public class HelloWorldImpl implements HelloWorld {

    /* (non-Javadoc)
     * @see com.example.hello.HelloWorld#printMyName()
     */
    @Override
    public void printMyName() {
        System.out.println("Muhammad Ali Qasmi");

    }

    /* (non-Javadoc)
     * @see com.example.hello.HelloWorld#addTwoNumbers(int, int)
     */
    @Override
    public int addTwoNumbers(final int x, final int y) {
        final int z = x * y;
        return z;
    }

    /* (non-Javadoc)
     * @see com.example.hello.HelloWorld#addTwoNumbers(float, float)
     */
    @Override
    public float addTwoFloatNumbers(final float x, final float y) {
        final float z = x + y;
        return z;
    }

    /* (non-Javadoc)
     * @see com.example.hello.HelloWorld#getFullName(java.lang.String, java.lang.String)
     */
    @Override
    public String getFullName(final String firstName, final String secondName) {
        final String fullName = firstName + " " + secondName;
        return fullName;
    }

}
