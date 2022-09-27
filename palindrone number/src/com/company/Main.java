package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int rem,palindrone=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a= sc.nextInt();
        while (a!=0){
            rem=a%10;
            palindrone=palindrone*10+rem;

        }
        if(a==palindrone){
            System.out.println("number is palindrone");
        }

    }
    else
    {
        System.out.println("number is not palindrone");
    }
}
