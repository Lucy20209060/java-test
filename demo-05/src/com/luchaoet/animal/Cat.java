package com.luchaoet.animal;

public class Cat {
    String name;
    int age;
    {
        System.out.println("构造代码块1");
    }
    public Cat() {
        System.out.println(name);
        System.out.println(age);
    }

    {
        System.out.println("构造代码块2");
    }
    public static void main(String[] args){
        System.out.println(123);
    }
}
