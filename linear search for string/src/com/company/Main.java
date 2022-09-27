package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int a= sc.nextInt();
        System.out.println("enter the str element in the array");
        String[]arr=new String[a];
        for (int i=0;i< arr.length;i++){
            String e= sc.next();
            arr[i]=e;
        }
        System.out.println("enter the search element:");
        String s= sc.next();
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals(s)){
                System.out.println("string found at index " + i);
            }
        }

    }
}
