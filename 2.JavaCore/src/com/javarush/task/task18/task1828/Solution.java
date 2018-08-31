package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

            String id = args[1];
            ArrayList<String> list = new ArrayList<>();
            BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
            String line = readerFile.readLine();
            while (line != null) {
                try {
                    list.add(line);
                } catch (Exception e) {
                }
                line = readerFile.readLine();
            }
            readerFile.close();

        try {
            if (args[0].equals("-u")) {
                String productName = args[2];
                for (int i = 3; i < args.length - 2; i++) {
                    productName = productName + " " + args[i];
                }
                String price = args[args.length - 2];
                String quantity = args[args.length - 1];
                for (int i = 0; i < list.size(); i++) {
                    String s = list.get(i).substring(0, 8).trim();
                    if (id.equals(s)) {
                        list.remove(i);
                        list.add(i, String.format("%-8s%-30.30s%-8.8s%-4.4s", id, productName, price, quantity));
                    }
                }
           } else if (args[0].equals("-d")) {
                for (int i = 0; i < list.size(); i++) {
                    String s = list.get(i).substring(0, 8).trim();
                    if (id.equals(s)) {
                        list.remove(i);
                    }
                }
           }
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i));
                writer.newLine();
            }
            writer.close();

        } catch (Exception e) {
        }
    }
}
