package com.company;

public class Main { fact(int n){
        int factorial=1;
        for (int i = n; i>=1; i--) {
            int factorial=factorial*i;
        }
        System.out.println(factorial);

    }

    public static void main(String[] args) {
    }
}
