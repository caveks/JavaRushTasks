package com.javarush.task.task02.task0216;

/* 
Минимум трёх чисел
*/
public class Solution {
    public static int min(int a, int b, int c) {

        // 1-й вариант

//        int min;
//        if (a < b){
//            min = a;
//        } else {
//            min = b;
//        }
//        if (min < c){
//            return min;
//        } else {
//            return c;
//        }

        // 2-й вариант

        int min = a < b ? a:b;
        return min < c ? min:c;
    }


    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(10, 5, 10));
    }

}