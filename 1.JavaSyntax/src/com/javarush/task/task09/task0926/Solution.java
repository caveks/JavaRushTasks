package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] one = new int[5];
        for (int i = 0; i < one.length; i++) {
            one[i] = (int) (Math.random() * 100);
        }

        int[] two = new int[2];
        for (int i = 0; i < two.length; i++) {
            two[i] = (int) (Math.random() * 100);
        }

        int[] three = new int[4];
        for (int i = 0; i < three.length; i++) {
            three[i] = (int) (Math.random() * 100);
        }

        int[] four = new int[7];
        for (int i = 0; i < four.length; i++) {
            four[i] = (int) (Math.random() * 100);
        }

        int[] five = new int[0];

        ArrayList<int[]> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);

//          2-й Вариант
//        int[] list1 = new int[]{1, 2, 3, 4, 5};
//        list.add(list1);
//        int[] list2 = new int[]{6, 7};
//        list.add(list2);
//        int[] list3 = new int[]{8, 9, 10, 11};
//        list.add(list3);
//        int[] list4 = new int[]{12, 13, 14, 15, 16, 17, 18};
//        list.add(list4);
//        int[] list5 = new int[]{};
//        list.add(list5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
