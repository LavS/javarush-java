package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(max(a,b,c,d));
    }

    public static int max(int a, int b, int c, int d){
        if (max(a, b) > max(c, d))
            return max(a, b);
        else
            return max(c, d);
    }

    public static int max(int x, int y){
        if (x >= y)
            return x;
        else
            return y;
    }
}
