package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i=0, j=0;
        while (i<10){
            while (j<9){
                System.out.print("S");
                j++;
            }
            System.out.println("S");
            j=0;
            i++;
        }
    }
}
