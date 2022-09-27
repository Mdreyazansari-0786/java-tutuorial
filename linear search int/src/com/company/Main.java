package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int a = sc.nextInt();
        int [] arr = new int [a];
        System.out.println("enter the element in the array:");
        for (int i = 0; i < arr.length; i++) {
            int e = sc.nextInt();
            arr[i]=e;
        }
        System.out.println("enter the element you want to search:");
        int sr = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==sr) {
                System.out.println("the element found at index " + i);
            }
        }
    }
}


