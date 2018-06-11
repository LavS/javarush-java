package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> text = new ArrayList<String>();
        text.add("Сижу за решёткой");
        text.add("В темнице сырой");
        text.add("Всормленны в неволе");
        text.add("Орёл молодой");
        text.add("Лермонтов");
        System.out.println(text.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(text.get(i));
        }
    }
}
