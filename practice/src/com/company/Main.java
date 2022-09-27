package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//      System.out.println("enter your age:");
//    int a= sc.nextInt();
        //   if(a>=18){
        //       System.out.println("you are adult");
        // }
        //   else {
        //     System.out.println("you are not adult");
        // }
        //}
//}
// program to print if student get 40% than pass or 33 mark in each subject to pass
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the marks of physics:");
//        byte phy = sc.nextByte();
//        System.out.println("enter the marks of math:");
//        byte math = sc.nextByte();
//        System.out.println("enter the marks of chemistry:");
//        byte che = sc.nextByte();
//        float total = phy + math + che;
//        float per = total / 3;
//        System.out.println("the total mark of a student" + total);
//        System.out.println("the percentage of a student" + per);
//        if (per >= 40 && phy >= 33 && math >= 33 && che >= 33) {
//            System.out.println("congrats you are pass");
//        } else {
//            System.out.println("you are fail");
//        }
        //print the day using switch case
/*        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your preference:");
        int day=sc.nextInt();
        switch (day){
            case 1-> System.out.println("sunday");
            case 2-> System.out.println("monday");
            case 3-> System.out.println("tuesday");
            case 4-> System.out.println("wednesday");
            case 5-> System.out.println("thursday");
            case 6-> System.out.println("friday");
            case 7-> System.out.println("saturday");
        }*/
        // cheak the website is which type of
  /*      Scanner sc=new Scanner(System.in);
        System.out.println("Enter your website:");
        String web= sc.next();
        if(web.endsWith(".com")){
            System.out.println("the website is comercial");
        }
        else if(web.endsWith(".in")){
            System.out.println("the website is indian website");
        }
        else if (web.endsWith(".org")){
            System.out.println("the website is organizational");
        }*/

        //wap to leap year or not

        System.out.println("Enter your year:");
        int year= sc.nextInt();
        if(year%4==0 && year%400==0 && year%100==0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("the year is not leap year");
        }
    }
}
