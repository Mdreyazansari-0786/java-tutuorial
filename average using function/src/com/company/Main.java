package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column:");
        int column = sc.nextInt();
        int num[][] = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            System.out.println("enter element = ");
            for (int j = 0; j < column; j++) {
                num[i][j] = sc.nextInt();
            }

                System.out.println("next row = ");


        }
        System.out.println("Enter the element you want to search:");
        int x= sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if(num[i][j]==x)
                {
                    System.out.print(x +" found at index(" + i +","+j +")");
                }
            }
        }
    }
}