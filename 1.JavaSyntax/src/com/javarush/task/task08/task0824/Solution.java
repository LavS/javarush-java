package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human[] humans = new Human[9];
        ArrayList<Human> empty = new ArrayList<Human>();

        humans[6] = new Human("Игорь", true, 2, empty);
        humans[7] = new Human("Максим", true, 5, empty);
        humans[8] = new Human("Юля", false, 7, empty);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(humans[6]);
        children.add(humans[7]);
        children.add(humans[8]);

        humans[4] = new Human("Михаил", true, 22, children);
        humans[5] = new Human("Аня", false, 21, children);
        ArrayList<Human> father = new ArrayList<Human>();
        father.add(humans[4]);
        ArrayList<Human> mother = new ArrayList<Human>();
        mother.add(humans[5]);

        humans[0] = new Human("Сергей", true, 51, father);
        humans[1] = new Human("Маша", false, 52, father);
        humans[2] = new Human("Павел", true, 56, mother);
        humans[3] = new Human("Катя", false, 55, mother);

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
