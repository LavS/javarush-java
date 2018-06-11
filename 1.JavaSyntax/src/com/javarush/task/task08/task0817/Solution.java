package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        String[] names = map.values().toArray(new String[0]);
        HashSet<String> tmp = new HashSet<String>();
        for (String s : names) {
            if (tmp.contains(s)) removeItemFromMapByValue(map,s);
            else tmp.add(s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
