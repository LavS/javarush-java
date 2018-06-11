package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    String name;
    int age;
    char sex;

    public static void main(String[] args) {

    }

    public void initialize(String newName){
        this.name = newName;
    }
    public void initialize(String newName, int newAge){
        this.name = newName;
        this.age = newAge;
    }
    public void initialize(String newName, int newAge, char newSex){
        this.name = newName;
        this.age = newAge;
        this.sex = newSex;
    }
}
