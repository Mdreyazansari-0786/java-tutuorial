package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println("the factorial of"+f);

    }
}
