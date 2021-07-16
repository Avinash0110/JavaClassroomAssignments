package com.assignments.assignment6;

public class Constructor
{
    Constructor(int x,int y,int z)
    {
        this(x,y);
        System.out.println(x+" "+y+" "+z);
    }
    Constructor(int x,int y)
    {
        System.out.println(x+" "+y);
    }
    public static void main(String[]args)
    {
        Constructor ac=new Constructor(1,2,3);

    }
}
