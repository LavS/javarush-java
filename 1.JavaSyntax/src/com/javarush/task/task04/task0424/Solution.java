package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a != b) && (a != c) && (b == c))
            System.out.println(1);
        if ((b != a) && (b != c) && (a == c))
            System.out.println(2);
        if ((c != b) && (c != a) && (a == b))
            System.out.println(3);

    }
}
