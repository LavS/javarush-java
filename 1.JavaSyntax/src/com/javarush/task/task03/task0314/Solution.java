package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            String s = "";
            for (int j = 1; j < 11; j++) {
                if (s == "")
                    s = "" + i*j;
                else
                    s = s + " " + i*j;
            }
            System.out.println(s);
        }
    }
}
