package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Лавров","Сергей");
        map.put("Иванов","Иван");
        map.put("Петров","Александр");
        map.put("Андронов","Сергей");
        map.put("Сидоров","Иван");
        map.put("Лавров","Петр");
        map.put("Ветров","Александр");
        map.put("Овечкин","Сергей");
        map.put("Свечкин","Олег");
        map.put("Лукьянов","Иван");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
