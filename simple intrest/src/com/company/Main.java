package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int am= sc.nextInt();
        System.out.println("Enter the time month:");
        int t= sc.nextInt();
        System.out.println("Enter the rate of intrest:");
        int in= sc.nextInt();
        float si=(am*t*in)/100;
        System.out.println("the simple intrest is="+si);
    }
}
