package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("Please enter the username that you desire. You will be given a password.");
        Scanner in= new Scanner(System.in);
        String user=in.next();

        String pass="";
        String database="ABCabc123!@#";
        for(int p=0;p<8;p++){
            int rd=(int)(Math.random()*database.length());
            pass=pass + database.substring(rd,(rd+1));
        }

        System.out.println("Your username is"+ " " +user);
        System.out.println("Your password is"+" "+pass);


        int grade[]=new int[]{100,67,95,93,87,78,50,99,89,69,96,98,93,82,79,76,97,98,100,95,91,89,87,97,83};

        for(int a=0;a<grade.length;a++){

        }

        System.out.println("If you would like to see a list of the grades of this class please enter your user name");
        Scanner in2=new Scanner(System.in);
        String login=in2.next();

        if(login.equals(user))
            System.out.println("Now please enetr")

    }
}
