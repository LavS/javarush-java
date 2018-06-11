package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human[] humans = new Human[9];
        humans[0] = new Human("Сергей", true, 51);
        humans[1] = new Human("Маша", false, 52);
        humans[2] = new Human("Павел", true, 56);
        humans[3] = new Human("Катя", false, 55);
        humans[4] = new Human("Михаил", true, 22, humans[0], humans[1]);
        humans[5] = new Human("Аня", false, 21, humans[2], humans[3]);
        humans[6] = new Human("Игорь", true, 2, humans[4], humans[5]);
        humans[7] = new Human("Максим", true, 5, humans[4], humans[5]);
        humans[8] = new Human("Юля", false, 7, humans[4], humans[5]);
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















