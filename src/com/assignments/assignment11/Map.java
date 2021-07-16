package com.assignments.assignment11;

import java.io.*;
import java.util.HashMap;

public class Map {

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        FileReader fileReader = new FileReader("src/com/assignments/assignment11/" + args[0]);
        int i;
        while ((i = fileReader.read()) != -1) {
            char ch = Character.toLowerCase((char) i);
            if (!Character.isLetter(ch))
                continue;
            int count = 1;
            if (hashMap.containsKey(ch))
                hashMap.replace(ch, count, count + 1);
            else
                hashMap.put(ch, count);
        }
        for (char ch : hashMap.keySet()) {
            System.out.println(ch + ":" + hashMap.get(ch));
        }
    }
}