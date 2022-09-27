package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int temp=0;
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        for(int i=2;i<=a-1;i++)
        {
            if(a%i==0)
            {
                temp +=1;
            }
        }
            if(temp==0){
                System.out.println(a +"  is prime number ");
            }
            else{
                System.out.println(a+ "the number is not prime");
            }

    }
}
