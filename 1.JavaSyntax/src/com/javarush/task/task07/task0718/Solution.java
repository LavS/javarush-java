package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int count = 0;
        int number = 0;
        boolean isOrdered = true;
        for (String element : list) {
            if (element.length() > count)
            {
                count = element.length();
                number++;
            }
            else {
                isOrdered = false;
                count = element.length();
                break;
            }
        }
        if(!isOrdered){System.out.println(number);}
    }
}

