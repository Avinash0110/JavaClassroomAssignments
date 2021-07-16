package com.assignments.assignment9;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the input string:");
        String inputString = keyboard.nextLine();
        boolean result=check(inputString);
        if(result)
        {
            System.out.println("The given input string matches the regular expression");
        }
        else
        {
            System.out.println("The given input string does not matches the regular expression");
        }

    }
    public static boolean check(String string)
    {
        Pattern pattern= Pattern.compile("^[A-Z][a-z A-Z 0-9 \\s]*[.]$");
        Matcher matcher=pattern.matcher(string);
        if(matcher.matches())
            return true;
        else
            return false;
    }
}
