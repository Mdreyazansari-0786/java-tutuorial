package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("the the number:");
        int a= sc.nextInt();
        for(int i=1;i<=10;i++){
            int table=a*i;
            System.out.println(a+"*"+i+"="+table);
        }

           }
    }
