package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of A:");
        int a= sc.nextInt();
        System.out.println("enter the value of B:");
        int b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.format(" a=%4d b=%4d",a,b);


}
}

