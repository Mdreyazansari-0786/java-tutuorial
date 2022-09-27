package com.company;
public class Main {
    public static void main(String[] args) {
        int[]a={10,20,3,06,9,2,58,92,6,55,2,6};
        int a_length=a.length;
        int[]b={20,5,6,5,5,9,6,558,6,2,8,8,5,2,96,25};
        int b_length=b.length;
        int c_length=a_length+b_length;
        int c[]=new int[c_length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]+"   ");
        }

        }
    }

