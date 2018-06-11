package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws Exception {
        return Integer.parseInt(readString());
    }

    public static double readDouble() throws Exception {
        return Double.parseDouble(readString());
    }

    public static boolean readBoolean() throws Exception {
        return Boolean.parseBoolean(readString());
    }

    public static void main(String[] args) {

    }
}
