package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainlist = new ArrayList<>();
        ArrayList<Integer> list_3 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            mainlist.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < mainlist.size(); i++){
            if ((mainlist.get(i) % 3 == 0) && (mainlist.get(i) % 2 == 0)) {
                list_3.add(mainlist.get(i));
                list_2.add(mainlist.get(i));
            } else if (mainlist.get(i) % 3 == 0) {
                list_3.add(mainlist.get(i));
            } else if (mainlist.get(i) % 2 == 0) {
                list_2.add(mainlist.get(i));
            } else {
                list.add(mainlist.get(i));
            }
        }
        Solution.printList(list_3);
        Solution.printList(list_2);
        Solution.printList(list);
    }

    public static void printList(List<Integer> list) {
        for (Integer d:list) {
            System.out.println(d);
        }
    }
}
