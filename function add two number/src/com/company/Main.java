package com.company;
import java.util.Scanner;
class Main {
     public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
     }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
         int a=sc.nextInt();
        System.out.println("enter the value of b;");
         int b= sc.nextInt();
         int sum=calculateSum(a,b);
        System.out.println("the sum of two number is "+sum);
    }
}
