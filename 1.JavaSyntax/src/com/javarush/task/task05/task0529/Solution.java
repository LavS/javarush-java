package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int sum = 0;
        while (!line.equals("сумма")){
            sum = sum + Integer.parseInt(line);
            line = reader.readLine();
        }
        System.out.println(sum);
    }
}
