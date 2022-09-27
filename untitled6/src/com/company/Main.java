package com.company;
public class Main {

    public static void main(String[] args) {
        int a[] = {1, 8, 69, 51, 88, 2, 5, 6, 9, 4};
        int temp, li = 0, hi = a.length - 1, mid = (li + hi )/ 2;
        int search = 88;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        while (li <= hi)
        {

            if (a[mid] == search)
            {
                System.out.println("element found at index " + mid + " ");
            } else if (a[mid] > search)
            {
                li = mid + 1;
            } else
            {
                hi = mid + 1;
            }
            mid = (li + hi)/ 2;
            if (li > hi) {
                System.out.println("element not found:");
            }

        }
    }
}