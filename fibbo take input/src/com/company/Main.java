package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a = 0, b = 1, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        System.out.format("%4d %4d", a, b);

        for (int i = 0; i <= num; i++) {
            temp=a+b;
            System.out.format("%4d",temp);
            a=b;
            b=temp;
            

        }
    }
}
