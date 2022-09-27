package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter a number:");
        int b = sc.nextInt();
        System.out.println("enter any operator(+,-,*,/,% = )");
        String opr = sc.next();
        switch(opr)
        {
            case "+":
                System.out.println("sum of two number = "+(a+b));
                break;
            case "-":
                System.out.println("sub of two number = "+(a-b));
                break;
            case "*":
                System.out.println("Multiply of two number = "+(a*b));
                break;
            case "/":
                System.out.println("Division of two number = "+(a/b));
                break;
            case "%":
                System.out.println("Modulus of two number = "+(a%b));
                break;
            default:
                System.out.println("Invalid input plz try again....");
        }
    }

}
