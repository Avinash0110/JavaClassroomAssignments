package avinash.assignment5.main;

import avinash.assignment5.data.Data;
import avinash.assignment5.singleton.Singleton;

public class Main
{
    public static void main(String args[])
    {
        Data data=new Data();
        data.printLocalVariables();
        data.printGlobalVariables();

        Singleton singleton=new Singleton();
        singleton.print();
    }
}
