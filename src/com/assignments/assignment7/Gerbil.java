package com.assignments.assignment7;
public class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("I am gerbil");
    }
    @Override
    public void gnaw()
    {
        System.out.println("gerbil's gnaw");
    }
    @Override
    public void excavate()
    {
        System.out.println("gerbil's excavate");
    }
}
