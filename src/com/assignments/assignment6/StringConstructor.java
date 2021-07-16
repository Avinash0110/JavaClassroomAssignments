package com.assignments.assignment6;

public class StringConstructor
{

    StringConstructor()
    {

        System.out.println("no argument constructor");
    }
    StringConstructor(String str)
    {
        System.out.println("argument constructor saying "+str);
    }
    public static void main(String[]args)
    {
        StringConstructor[] sc;
        sc=new StringConstructor[2];
        sc[0]=new StringConstructor("im with arguments");
        sc[1]=new StringConstructor();



    }
}
