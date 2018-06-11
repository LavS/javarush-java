package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Лавров", 1000);
        map.put("Иванов", 200);
        map.put("Петров", 300);
        map.put("Андронов", 400);
        map.put("Сидоров", 500);
        map.put("Олегов", 600);
        map.put("Ветров", 700);
        map.put("Овечкин", 800);
        map.put("Свечкин", 900);
        map.put("Лукьянов", 100);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if(iterator.next().getValue()<500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}