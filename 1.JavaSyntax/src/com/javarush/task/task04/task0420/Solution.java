package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max(a,b,c) + " " + mid(a,b,c) + " " + min(a,b,c));
    }

    public static int min(int a, int b){
        if (a <= b)
            return a;
        else
            return b;
    }

    public static int min(int a, int b, int c){
        if ((a <= b) && (a <= c))
            return a;
        else if ((b <= a) && (b <= c))
            return b;
        else
            return c;
    }

    public static int max(int a, int b, int c){
        if ((a >= b) && (a >= c))
            return a;
        else if ((b >= a) && (b >= c))
            return b;
        else
            return c;
    }

    public static int mid(int a, int b, int c){
        if (min(a,b,c) == a)
            return min(b,c);
        else if (min(a,b,c) == b)
            return min(a,c);
        else
            return min(a,b);
    }
}
