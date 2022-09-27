package com.company;
public class Main {

    public static void main(String[] args) {
        int a[]={1,5,5,21,8,5,21,58,2,2,4,8,56,2,1,58,};
    int max=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println("maximum value in array:"+max);
    }
}
