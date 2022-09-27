package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
    String name=sc.nextLine();
        System.out.println("good morning "+name);
        //concatenation
        System.out.println("enter your first name:");
        String firstname=sc.nextLine();
        System.out.println("enter your last name:");
        String lastname= sc.nextLine();
        String fullname=firstname+lastname;
        System.out.println(fullname);
        //find length of a String
        System.out.println(fullname.length());
        //print the each character of string
        for (int i=0;i<fullname.length();i++) {
            System.out.println(fullname.charAt(i));
        }
        //compare to string
        System.out.println("Enter the name1:");
        String name1=sc.next();
        System.out.println("Enter the name2:");
        String name2= sc.next();
        if(name1.compareTo(name2)==0) {
            System.out.println("string is equal:");
        }
        else
        {
            System.out.println("string is not equal:");
        }
        //sub string
        String sen="md reyaz ansari";
        String substring=sen.substring(0,5);
        System.out.println(substring);
    }
}
