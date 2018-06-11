package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public static void main(String[] args) {

    }

    public void initialize(String name){
        this.name = name;
        this.weight = 10;
        this.color = "";
        this.age = 3;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.color = "";
        this.age = age;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.weight = 10;
        this.color = "";
        this.age = age;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.age = 3;
        this.address = address;
    }
}
