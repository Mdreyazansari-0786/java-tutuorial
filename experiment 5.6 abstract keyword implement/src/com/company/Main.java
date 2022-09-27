package com.company;
import java.awt.*;
import java.util.ServiceConfigurationError;

public class Main {

    public static void main(String[] args) {
	abstract class figure {
        double dim1, dim2;

        figure(double a, double b)
        {
        dim1=a;
        dim2=b;

        }
        abstract double area();
    }
    class Rectangle extends figure
    {
     Rectangle(double a,double b)
     {
     super(a,b);
     }
     double area();

    }
    return(dim1*dim2);
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a,b)
    }
double area()
{
    return((dim1*dim2)/2);
}
}
class Abstract
{
    public static void main(String [] args)
    {
        Rectangle r=new Rectangle(6,6);
        double ar=r.area();
        Triangle t=new Triangle(6,6);
        double at=r.area();
        System.out.println("area of a rectangle"+ar);
        System.out.println("area of triangle"+at);
    }

}

