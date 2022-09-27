package com.company;
public class Main {
    public static void main(String[] args) {
        int a[]={10,50,6,0,9,8,41,5,1,1,5,2,56,};
        int del_ele=1;
        for (int i=0;i< a.length;i++) {
            if(del_ele==a[i]){
                for (int j = i; j <a.length-1 ; j++)
                {
                    a[j]=a[j+1];

                }
                break;
            }
        }
        for (int i=0;i< a.length-1;i++){
            System.out.print(a[i]+",");
        }
    }
}
