package com.company;

public class Main {

    public static void main(String[] args) {
	int []a={10,20,6,8,20,74,96,3,8,1,8,};
    int ele=1000,index_pos=5;
        for (int i = a.length-1; i >index_pos; i--) {
            a[i]=a[i-1];

        }
        a[index_pos]=ele;
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");

        }

    }
}
