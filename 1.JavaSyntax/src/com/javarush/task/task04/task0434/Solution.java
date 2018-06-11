package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i=1, j=1;
        while (i<=10){
            String s = "";
            while (j<=10){
                if (s == "")
                    s = "" + i*j;
                else
                    s = s + " " + i*j;
                j++;
            }
            System.out.println(s);
            j = 1;
            i++;
        }
    }
}
