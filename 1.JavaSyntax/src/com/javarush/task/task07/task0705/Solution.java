package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] bigArray = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 20; i++) {
            bigArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            array1[i] = bigArray[i];
            array2[i] = bigArray[i+10];
            System.out.println(array2[i]);
        }
    }
}
