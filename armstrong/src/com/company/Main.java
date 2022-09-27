package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
    int a= sc.nextInt();
    int t=a;
    int len=0;
    while (t!=0)
    {
        len=len+1;
        t=t/10;
    }
    int t1=a;
    int arm=0;
    int rem;
    while (t1!=0){
        int mul=1;
        rem=a%10;
        for (int i=1;i<=len;i++){
            mul=mul*rem;
        }
        arm=arm+mul;
    }
    if(a==arm)
    {
        System.out.println("number is armstrong:");
    }
    else
    {
        System.out.println("number is not armstrong");
    }
    }
}
