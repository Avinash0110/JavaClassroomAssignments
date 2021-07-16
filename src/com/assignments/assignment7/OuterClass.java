package com.assignments.assignment7;

public class OuterClass
{
    class InnerClass
    {
        InnerClass()
        {
            System.out.println("inner class constructor");
        }
    }
    class SecondInnerClass extends InnerClass
    {
        SecondInnerClass()
        {
            System.out.println("second inner class constructor");
        }
    }
    SecondInnerClass secondInnerClass=new SecondInnerClass();
}
