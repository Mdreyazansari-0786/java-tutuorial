package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int a[][]=int[][];

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element of array:");
        int n= sc.nextInt();
    for (int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}
