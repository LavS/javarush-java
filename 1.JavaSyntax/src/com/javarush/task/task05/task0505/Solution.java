package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 3, 10, 5);
        Cat cat2 = new Cat("Petya", 5, 8, 8);
        Cat cat3 = new Cat("Fedya", 7, 15, 3);
        System.out.println("Сражаются коты: " + cat1.name + " и " + cat2.name + ". Победил кот: " + (cat1.fight(cat2) ? cat1.name : cat2.name));
        System.out.println("Сражаются коты: " + cat2.name + " и " + cat3.name + ". Победил кот: " + (cat2.fight(cat3) ? cat2.name : cat3.name));
        System.out.println("Сражаются коты: " + cat1.name + " и " + cat3.name + ". Победил кот: " + (cat1.fight(cat3) ? cat1.name : cat3.name));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
