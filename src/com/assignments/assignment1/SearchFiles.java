package com.assignments.assignment1;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchFiles {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            System.out.println("Enter Regular Expression(type terminate to end the process):");
            String regExp = br.readLine();
            if(regExp.contentEquals("terminate")) {
                System.out.println("Searching of files has terminated");
                break;
            }

            fetchFiles("/home", regExp);
        }

    }
    public static void fetchFiles(String path, String regExp) {
        File directory = new File(path);
        File[] fileNames = directory.listFiles(); // all files in the directory
        if (fileNames!= null && fileNames.length > 0)
        {
            for (File file : fileNames)
                if (file.isDirectory()) // If file is a directory or folder then again call the function for getting files
                {
                    fetchFiles(file.getAbsolutePath(), regExp);
                }
                else if (file.getName().contains(regExp))
                {
                    System.out.println(file.getAbsolutePath() + "     " + file.getName());
                }
        }
    }
}