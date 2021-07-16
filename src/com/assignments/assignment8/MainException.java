package com.assignments.assignment8;

public class MainException
{
    public static void main(String args[])
    {
            MainException mainException = new MainException();
            try
            {
                mainException.method();
            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }
            finally
            {
                System.out.println("Finally Block code");
            }
    }
    public void method() throws Exception1, Exception2, Exception3
    {
        //throw new Exception1("NewException1");
        //throw new Exception2("NewException2");
        //throw new Exception3("NewException3");
        throw new NullPointerException();
    }

}
