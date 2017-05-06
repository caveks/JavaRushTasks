package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int l = list.get(0).length();
        for (int i = 1; i < list.size(); i++){
            if (l < list.get(i).length()){
                l = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++){
            int s = list.get(i).length();
            if (s == l){
                System.out.println(list.get(i));
            }
        }

    }
}
