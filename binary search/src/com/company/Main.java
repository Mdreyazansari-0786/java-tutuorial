package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a[]={1,2,6,9,10,20,60};
        int li=0,hi=a.length-1;

        int search=20;
        while (li <= hi)
        {
            int mid = (li + hi)/ 2;
            if (a[mid] == search)
            {
                System.out.println("element found at index " + mid + " ");
                break;
            } else if (a[mid] > search)
            {
                hi = mid - 1;
            } else
            {
                li = mid + 1;
            }
        }
    }
}

