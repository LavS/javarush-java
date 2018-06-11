package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    String name;
    int age;
    char sex;

    public static void main(String[] args) {

    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public char getSex(){
        return this.sex;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setSex(char newSex){
        this.sex = newSex;
    }
}
