package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }
}
