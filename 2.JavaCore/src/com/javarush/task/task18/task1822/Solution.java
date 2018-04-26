package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String s = input.readLine();

        while (s != null) {
            if (s.startsWith(args[0] + " ")){
              char[] data = s.toCharArray();
                    System.out.print(data);
                break;
            } else {
                s = input.readLine();
            }
       }
       input.close();
    }
}
