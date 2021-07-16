package com.assignments.assignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PingMedianTime
{
    public static void main(String[] args)
    {
     String ip="www.google.com";
     pingHost("ping -c 5 "+ip);
    }
    public static void pingHost(String command)
    {
        int count=0,i=0;
        double[] times=new double[5];
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String str = "";
            while ((str = inputStream.readLine()) != null)
            {
                System.out.println(str);
                int index1=str.lastIndexOf("=");
                int index2=str.lastIndexOf("ms");
                if(index1!=-1&&index2!=-1&&count<5){
                    count++;
                    double time=Double.parseDouble(str.substring(index1+1,index2-1));
                    times[i++]=time;}
            }
            Arrays.sort(times);
            System.out.println("Median Time to ping:"+times[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
