package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String s= sc.next();
        int len=s.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse of string"+s+"is = "+rev);
    }
}
