package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> result = new HashSet<Object>();
        Iterator<Cat> iteratorCat = cats.iterator();
        while (iteratorCat.hasNext()){
            result.add(iteratorCat.next());
        }
        Iterator<Dog> iteratorDog = dogs.iterator();
        while (iteratorDog.hasNext()){
            result.add(iteratorDog.next());
        }
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()){
            if(cats.contains(iterator.next())){
                iterator.remove();
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static class Cat{}
    public static class Dog{}
}
