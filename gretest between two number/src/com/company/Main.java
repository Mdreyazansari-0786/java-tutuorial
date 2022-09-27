package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of A:");
        int a=sc.nextInt();
        System.out.println("enter the value of B:");
        int b=sc.nextInt();
        System.out.println("enter the value of C:");
        int c= sc.nextInt();
    if(a>b&&a>c){
        System.out.println("A is greater among three:");

    }
     else if (b>a&&b>c){
            System.out.println("b is greater among:");
        }
     else
    {
        System.out.println("c is greater among three:");
    }
    }
}
