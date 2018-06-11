package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public Cat(String name){
        this.name = name;
        this.weight = 10;
        this.color = "";
        this.age = 3;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.color = "";
        this.age = age;
    }
    public Cat(String name, int age){
        this.name = name;
        this.weight = 10;
        this.color = "";
        this.age = age;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 3;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.age = 3;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
