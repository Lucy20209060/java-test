package com.luchaoet.animal;

public class Animal {
    private String name;
    private int month;
    private String specis;

    public Animal(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecis(){
        return specis;
    }
    public void setSpecis(String specis){
        this.specis = specis;
    }

    public void eat() {
        System.out.println("吃东西");
    }

    private static void back() {

    }

    private final void dispaly(){

    }



}
