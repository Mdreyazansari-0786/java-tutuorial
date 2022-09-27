package com.company;

public class Main {

    public static void main(String[] args) {
        int a[]={10,1,2,2,26,5,5,8,8,96,55,55};
        int temp[]=new int[a.length];
        int j=0;
        for (int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
            temp[j]=a[a.length-1];
        }
        for (int i = 0;i<temp.length; i++) {
            System.out.print(temp[i]+" ,");

        }

    }

}

