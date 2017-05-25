package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("FGdfdbd", new Date("JULY 7 1985"));
        map.put("Bdxcvxc", new Date("MAY 15 1974"));
        map.put("YUtyhfbv", new Date("SEPTEMBER 20 1987"));
        map.put("XCsdffdfs", new Date("OCTOBER 30 1985"));
        map.put("YIygjgn", new Date("NOVEMBER 11 1986"));
        map.put("HJyujtyh", new Date("AUGUST 19 1984"));
        map.put("SfIuy", new Date("JANUARY 3 1952"));
        map.put("Edfgfd", new Date("JUNE 25 1978"));
        map.put("Ifjfbc", new Date("DECEMBER 14 1989"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            int d = date.getMonth();
            if (d > 4 && d < 8)
            iterator.remove();
        }

    }

    public static void main(String[] args) {
    }
}
