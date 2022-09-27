package com.company;
import java.util.Scanner;
public class Triangle1
{
    float area;
Triangle1(float area)
{
  this.area=area;
}
void  display()
{
    System.out.println("the area of a triangle:"+this.area);
}
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your length");
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        System.out.println("Enter your breath");
        int b= sc.nextInt();
        System.out.println("Enter your hight");
        int h= sc.nextInt();
        float s=(l+b+h);
        float area=(float)Math.sqrt(s*(s-l)*(s-b)*(s-h));

        Triangle1 obj=new Triangle1(area);
        obj.display();

    }
}
