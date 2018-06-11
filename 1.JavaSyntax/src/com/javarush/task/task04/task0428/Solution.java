package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s = 0;
        if (a > 0) s = s + 1;
        if (b > 0) s = s + 1;
        if (c > 0) s = s + 1;
        System.out.println(s);
    }
}
