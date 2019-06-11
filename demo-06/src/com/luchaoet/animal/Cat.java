package com.luchaoet.animal;

public class Cat extends Animal{
    private double weight;

    public Cat() {

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

//    父类的静态方法不能被重写
    public void back(){

    }

    public void dispaly(){

    }
}
