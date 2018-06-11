package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        String s = "";
        for (int j = 0; j < n; j++) {
            s = s + 8;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(s);
        }
    }
}
