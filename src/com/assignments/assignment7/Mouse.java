package com.assignments.assignment7;
public class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("I am mouse");
    }
    @Override
    public void gnaw()
    {
        System.out.println("mouse's gnaw");
    }
    @Override
    public void excavate()
    {
        System.out.println("mouse's excavate");
    }
}
