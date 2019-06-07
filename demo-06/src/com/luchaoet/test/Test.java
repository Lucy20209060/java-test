package com.luchaoet.test;

import com.luchaoet.animal.Cat;

public class Test {
    public static void main(String[] args){
        Cat mycat = new Cat();
        mycat.setName("花花");
        String name = mycat.getName();
        System.out.println(name);
    }
}
