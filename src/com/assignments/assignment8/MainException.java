package com.assignments.assignment8;

import java.util.Scanner;

public class MainException
{
    public static void error(String input) throws Exception1,Exception2,Exception3{
        if(input.contentEquals(" "))
            throw new Exception1();
        else if(input.contains("@"))
            throw new Exception2();
        else if(input.contains("!"))
            throw new Exception3();


    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        try{
            error(sc.nextLine());

        }catch(Exception1|Exception2|Exception3 e){
            e.message();
            e.printStackTrace();

        }finally{
            System.out.println("\n Always running the final block.........");
        }
    }
}


