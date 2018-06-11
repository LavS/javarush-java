package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("01.06.1980"));
        map.put("Wan", df.parse("03.06.1981"));
        map.put("Roman", df.parse("05.05.1982"));
        map.put("Segal", df.parse("07.06.1983"));
        map.put("Ivan", df.parse("06.07.1984"));
        map.put("Gulie", df.parse("09.01.1985"));
        map.put("Spilberg", df.parse("12.03.1986"));
        map.put("Book", df.parse("11.04.1987"));
        map.put("Jonnen", df.parse("6.06.1988"));
        map.put("Joker", df.parse("4.07.1989"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Date date = iterator.next().getValue();
            if((date.getMonth()>4) && (date.getMonth()<8)){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
