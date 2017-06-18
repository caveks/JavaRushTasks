package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] c = s.toCharArray();

        for (int i = 0; i < 40; i++) {
            for (int m = i; m < c.length; m++) {
                if (c[m] != ' ') {
                    System.out.print(c[m]);
                } else if ((c[m] == ' ') && (m != i)){
                    System.out.print(c[m]);
                    System.out.print(c[m + 1]);
                    m++;
                }
            }
            System.out.println();
        }
    }
}

