package com.assignments.assignment7;

public class Bicycle extends Cycle implements Cycles
{
    @Override
    public void balance()
    {
        System.out.println("Bicycle's balance");
    }
    @Override
    public void factory()
    {
      System.out.println("Bicycle's factory");
    }
}
