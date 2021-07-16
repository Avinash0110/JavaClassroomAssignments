package com.assignments.assignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class AlphabetsCheck
{
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the input string:");
        String inputString = keyboard.nextLine();
        int totalAlphabets = 26;
        int result= checkInputString(inputString);
        if(result==totalAlphabets)
        {
            System.out.println("The given input string contains all the alphabets..");
        }
        else
        {
            System.out.println("The given input string does not contain all the alphabets..");
        }

    }
    public static int checkInputString(String inputString)
    {
        ArrayList<Character> alphabetCheckList = new ArrayList<>();
        char character;
        for (int i = 0; i < inputString.length(); i++)
        {
            character = inputString.toLowerCase().charAt(i);
            if (character >= 'a' && character <= 'z')
            {
                if(!alphabetCheckList.contains(character))
                {
                    alphabetCheckList.add(character);
                }
            }
        }
        return alphabetCheckList.size();
    }
}

