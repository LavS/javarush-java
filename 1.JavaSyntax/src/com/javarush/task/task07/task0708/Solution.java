package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxSize = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < 5; i++) {
            int size = strings.get(i).length();
            if (size > maxSize)
                maxSize = size;
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == maxSize)
                System.out.println(strings.get(i));
        }
    }
}
