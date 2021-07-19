package com.assignments.assignment8;

public class Exception2 extends Exception implements UserException {


    public void message() {
        System.out.println("Throwing MyException2...saying name should not contain @");

    }
}