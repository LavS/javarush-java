package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Заполнение списка
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> text = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            text.add(reader.readLine());
        }

        // Нахождение минимума и максимума
        int minSize = text.get(0).length();
        int maxSize = 0;
        for (int i = 0; i < 5; i++) {
            int size = text.get(i).length();
            if (size < minSize)
                minSize = size;
            if (size > maxSize)
                maxSize = size;
        }

        // Вывод первой минимальной или максимальной строки
        String out = "";
        for (int i = 0; i < 5; i++) {
            if ((out == "") && ((text.get(i).length() == minSize) || (text.get(i).length() == maxSize)))
                out = text.get(i);
        }
        System.out.println(out);
    }
}
