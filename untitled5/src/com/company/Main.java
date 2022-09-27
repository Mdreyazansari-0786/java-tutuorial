package com.company;

public class Main {

    public static void main(String[] args)
    {
        int [][][] a={{{10,20,30}},{{5,9,6,85}},{{2,6,8,9,7}}};
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
                for (int k=0;k<a[i][j].length;k++)
            System.out.print(a[i][j][k]+",");
            System.out.println();
        }


        System.out.print(a.length);

    }
}
