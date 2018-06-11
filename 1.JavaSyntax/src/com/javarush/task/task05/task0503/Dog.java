package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    String name;
    int age;

    public static void main(String[] args) {

    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
}
