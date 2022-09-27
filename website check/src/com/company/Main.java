package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the website:");
        String web= sc.next();
        if(web.endsWith(".com")) {
            System.out.println("the website is comercial:");
        }
            else if(web.endsWith(".in")){
                System.out.println("the website is indian:");

            }
            else if (web.endsWith(".org")){
            System.out.println("the website is organisational:");
        }
    }
}

