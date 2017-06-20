package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("firstList");
        list.add("List");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("List1");
        list1.add("List1word");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("List2");
        list2.add("List2word");
        list2.add("List2word2");

        ArrayList<String>[] arrayOfStringList = new ArrayList[3];
        arrayOfStringList[0] = list;
        arrayOfStringList[1] = list1;
        arrayOfStringList[2] = list2;


        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}