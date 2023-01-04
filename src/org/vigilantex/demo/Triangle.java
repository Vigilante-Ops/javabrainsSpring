package org.vigilantex.demo;

public class Triangle
{

    private String testValue;
    private int height;

    public int getHeight() {
        return height;
    }

    public Triangle(String testValue, int height) {
        this.testValue = testValue;
        this.height = height;
    }

    public Triangle(String testValue) {
        this.testValue = testValue;
    }

    public String getTestValue() {
        return testValue;
    }
//commenting setter used in property DI
    /*public void setTestValue(String testValue) {
        this.testValue = testValue;
    }*/


    public void draw()
    {
        System.out.println("triangle");

    }
}
