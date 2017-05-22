package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i ++){
            list.add(Integer.parseInt(reader.readLine()));
        }

            for (int i = 0; i < list.size(); i++) {
                int a = list.get(i);
                int n = 1;
                    for (int m = i + 1; m < list.size(); m++) {
                        if (a == list.get(m)) {
                            n++;
                        } else {
                            break;
                        }
                    }
                if (max < n) {
                    max = n;
                }
            }
        System.out.println(max);
    }
}