package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, i = 0;
        i = scanner.nextInt();
        while (i != -1){
            sum = sum + i;
            count++;
            i = scanner.nextInt();
        }
        if (count == 0) System.out.println(0);
        else System.out.println((double)sum/count);
    }
}

