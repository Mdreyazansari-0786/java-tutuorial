package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of physics:");
        float phy=sc.nextFloat();
        System.out.println("Enter the marks of math:");
        float math=sc.nextFloat();
        System.out.println("Enter the marks of chemistry:");
        float che=sc.nextFloat();
        float total=phy+math+che;
        float per=total/3;
        System.out.println("the total marks of a student = "+total);
        System.out.println("the percentage of a student = "+per);
        if(per>=40 && phy>=33 && math>=33 && che>=33) {
            System.out.println("congratulation u are pass");
        }
        else{
            System.out.println("u are fail");
        }


    }
}
