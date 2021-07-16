package avinash.assignment5.singleton;
public class Singleton
{
    String name;
    /*public static Singleton printObject(String name)
    {
        this.name=name;
        return this;

    } *///non static variable cannot be referenced from a static content
    public void print()
    {
        System.out.println(name);
    }
}
