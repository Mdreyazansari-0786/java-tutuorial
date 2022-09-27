package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int a= sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter your element:");
        for (int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the element you want to remove:");
        int r=sc.nextInt();
        for (int j=0;j< arr.length;j++)
        {
            if(arr[j]==r)
            {
                for(int k=j;k< arr.length-1;k++)
                {
                  arr[k]=arr[k+1];
                }
                break;

            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
