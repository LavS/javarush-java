package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 11; i++) {
            String s = "";
            for (int j = 0; j < i; j++) {
                s = s + 8;
            }
            if (s != "") System.out.println(s);
        }
    }
}
