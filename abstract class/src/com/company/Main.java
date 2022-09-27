package com.company;
abstract  class A{
    abstract void display();
}
class son extends A{
    void display(){
        System.out.println("i am son class");
    }
}
class daughter extends A{
    void display(){
        System.out.println("i am daughter class");
    }

}


public class Main {
    public static void main(String[] args) {
        son s=new son();
        s.display();
        daughter d=new daughter();
        d.display();
    }
}
