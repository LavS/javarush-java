package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Лавров","Сергей");
        map.put("Иванов","Иван");
        map.put("Петров","Александр");
        map.put("Андронов","Сергей");
        map.put("Сидоров","Иван");
        map.put("Олегов","Петр");
        map.put("Ветров","Александр");
        map.put("Овечкин","Сергей");
        map.put("Свечкин","Олег");
        map.put("Лукьянов","Иван");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        for (String s: map.values()) {
            if (s.equals(name)){
                i++;
            }
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        for (String s: map.keySet()) {
            if (s.equals(lastName)){
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

    }
}
