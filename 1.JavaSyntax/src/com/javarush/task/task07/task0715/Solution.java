package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        String add = "именно";
        list.add(3,add);
        list.add(2,add);
        list.add(1,add);
        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }
    }
}
