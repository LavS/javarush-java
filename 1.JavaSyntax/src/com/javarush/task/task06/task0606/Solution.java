package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit;
        while (num > 0){
            digit = num % 10;
            if (digit % 2 == 0)
                even++;
            else
                odd++;
            num = num / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
