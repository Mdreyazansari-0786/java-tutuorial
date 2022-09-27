package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("reyaz");
        System.out.println(sb);
        //char at index;
        System.out.println(sb.charAt(4));
        //set char at index
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //insert at index
        sb.insert(0,'t');
        System.out.println(sb);
        //append
        sb.append('f');
        System.out.println(sb);
        //delete char or substring
        sb.delete(0,3);
        System.out.println(sb);

    }
}
