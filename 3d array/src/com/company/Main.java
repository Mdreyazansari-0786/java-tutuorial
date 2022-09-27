package com.company;

public class Main {

    public static void main(String[] args) {
	int a[][][]={{{10,20,50,51},{5,6,8,66,58},{78,88,96,45,63}}};
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            for (int k=0;k<a[i][j].length;k++){
                System.out.print(a[i][j][k]+",");
            }
            System.out.println();
        }
    }
    }
}
