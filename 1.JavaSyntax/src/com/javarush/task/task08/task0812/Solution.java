package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0, max = 0, k = 0;
        for (int i = 0; i < 10; i++) {
            int s = Integer.parseInt(bis.readLine());
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            int m = list.get(i);
            if (num == m){
                k++;
                if (k > max){
                    max = k;
                }
            }else {
                num = m;
                k = 1;
            }
        }
        if (max==0) {max = 1;}
        System.out.println(max);    }
}