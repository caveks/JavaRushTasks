package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (((a > b) && (b > c)) || ((a < b) && (b < c))) {
            System.out.println(b);
        } else if (((b > c) && (c > a)) || ((b < c) && (c < a))) {
            System.out.println(c);
        } else if (((c > a) && (a > b)) || ((c < a) && (a < c))) {
            System.out.println(a);
        } else if (((a > c) && (a < b))){
            System.out.println(a);
        } else if ((a == b) && (b == c)) {
            System.out.println(a);
        } else if ((a == b) || (a == c)) {
            System.out.println(a);
        } else if (b == c) {
            System.out.println(b);
        }
    }
}
