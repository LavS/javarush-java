package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Peter", 25, "Piter");
        Man man2 = new Man("Sergio", 35, "Moscow");
        Woman woman1 = new Woman("Irina", 20, "Kursk");
        Woman woman2 = new Woman("Olesya", 35, "Orenburg");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());
    }

    public static class Person
    {
        String name, address;
        int age;

        public Person(){
            this.name = "NoName";
            this.age = 18;
            this.address = null;
        }

        public Person(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Man extends Person
    {
        public Man(){
            super();
        }
        public Man(String name, int age, String address){
            super(name, age, address);
        }
    }

    public static class Woman extends Person
    {
        public Woman(){
            super();
        }
        public Woman(String name, int age, String address){
            super(name, age, address);
        }
    }
}
