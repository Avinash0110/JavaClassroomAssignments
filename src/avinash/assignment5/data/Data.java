package avinash.assignment5.data;
public class Data
{
int  a;
char ch;
public void printGlobalVariables()
{
    System.out.println("int:"+a);
    System.out.println("char:"+ch);
}
public void printLocalVariables()
{
    int a;
    char ch;
    //System.out.println("int:"+a);
    //System.out.println("char:"+ch); local variables must be initialized
}
}
