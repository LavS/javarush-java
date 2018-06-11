package com.javarush.task.task07.task0713;

import sun.rmi.server.InactiveGroupException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            Integer current = list.get(i);
            if (current % 3 == 0) list3.add(current);
            if (current % 2 == 0) list2.add(current);
            if ((current % 3 != 0) && (current % 2 != 0)) list1.add(current);
        }
        printList(list3);
        printList(list2);
        printList(list1);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
