package com.assignments.assignment10;

public class Main
{

    public static void main(String[] args){


        SList<Integer> list=new SList<>();
        SListIterator<Integer> it=new SListIterator<>(list);
        it.add(20);
        System.out.println(list.toString());
        it.add(42);
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.add(78);
        it.add(89);
        it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());

    }
}

