package com.company;

public class Main {

    public static void main(String[] args) {
        //get Bit
	int n=5;
    int pos=2;
    int bitmask=1<<pos;
    if((bitmask & n)==0){
        System.out.println("the bit was zero:");
    }
    else
    {
        System.out.println("the bit was one:");
    }
    // set Bit
    int num=5;
    int P=1;
    int bitmasks=1<<P;
    int newNumber=bitmasks|num;
        System.out.println(newNumber);
        //clear Bit:
        int n1=5;
        int p2=2;
        int bitmaskclear=1<<p2;
        int notBitmask=~(bitmaskclear);
        int number=notBitmask & n1;
        System.out.println(number);
        //update Bit

    }
}
