package com.assignments.assignment7;
public class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("I am hamster");
    }
    @Override
    public void gnaw()
    {
        System.out.println("hamster's gnaw");
    }
    @Override
    public void excavate()
    {
        System.out.println("hamster's excavate");
    }
}
