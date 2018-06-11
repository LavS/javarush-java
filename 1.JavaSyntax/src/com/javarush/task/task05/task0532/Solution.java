package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()), num;
        int maximum = Integer.parseInt(reader.readLine());
        for (int i = 1; i < N; i++){
            num = Integer.parseInt(reader.readLine());
            if (num > maximum) maximum = num;
        }
        System.out.println(maximum);
    }
}
