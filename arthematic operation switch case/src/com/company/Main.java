package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number1:");
        int a= sc.nextInt();
        System.out.println("enter the number2:");
        int b= sc.nextInt();
        System.out.println("Enter your preference(+,-,*,/)");
        char ope=sc.next().charAt(0);
        switch (ope){
            case '+':
                System.out.println("the add of two number" +(a+b));
                break;
            case '-':
                System.out.println("the sub of two number" +(a-b));
                break;
            case '*':
                System.out.println("the multiply of two number" + (a*b));
                break;
            case '/':
                System.out.println("the divide of two number " +(a/b));
                break;


        }


    }
}
