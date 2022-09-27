package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int a= sc.nextInt();
        for (int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("i ");
            }
            System.out.println();
        }
        for(int i=1;i<=a;i++){
            for (int j=a;j>=i;j--){
                System.out.print("love");
            }
            System.out.println();
        }
    }
}
