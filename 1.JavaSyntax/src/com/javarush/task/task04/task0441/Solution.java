package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (((b >= a) && (a >= c)) || ((b <= a) && (a <= c)) ) System.out.println(a);
        else if (((a >= b) && (b >= c)) || ((a <= b) && (b <= c)) ) System.out.println(b);
        else if (((a >= c) && (c >= b)) || ((a <= c) && (c <= b)) ) System.out.println(c);
    }
}
