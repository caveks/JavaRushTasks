package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try {
            if (args[0].equals("-c")) {
                BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
                int id = 0;
                String line = readerFile.readLine();
                while (line != null) {
                    try {
                        String s = line.substring(0,8).trim();
                        int idInt = Integer.parseInt(s);
                        if (idInt > id) {
                            id = idInt;
                        }
                    } catch (Exception e){
                    }
                    line = readerFile.readLine();
                }
                int index = id + 1;
                String iD = String.valueOf(index);
                StringBuilder builder = new StringBuilder(iD);
                if (iD.length() < 8) {
                    for (int i = iD.length(); i < 8; i++) {
                        builder.append(" ");
                    }
                }

                String productName = args[1];
                String price = args[args.length - 2];
                String quantity = args[args.length - 1];
                for (int i = 2; i < args.length - 2; i++) {
                    productName = productName + " " + args[i];
                }

                StringBuilder pName = new StringBuilder(productName);
                StringBuilder pRice = new StringBuilder(price);
                StringBuilder qUantity = new StringBuilder(quantity);

                if (productName.length() < 30) {
                    for (int i = productName.length(); i < 30; i++) {
                        pName.append(" ");
                    }
                } else {
                    for (int i = productName.length(); i > 30; i--) {
                        pName.delete(i - 1, i);
                    }
                }
                if (price.length() < 8) {
                    for (int i = price.length(); i < 8; i++) {
                        pRice.append(" ");
                    }
                } else {
                    for (int i = price.length(); i > 8; i--) {
                        pRice.delete(i - 1, i);
                    }
                }
                if (quantity.length() < 4) {
                    for (int i = quantity.length(); i < 4; i++) {
                        qUantity.append(" ");
                    }
                } else {
                    for (int i = quantity.length(); i > 4; i--) {
                        qUantity.delete(i - 1, i);
                    }
                }
                String h = builder.toString() + pName.toString() + pRice.toString() + qUantity.toString();
                readerFile.close();
                BufferedWriter outputFile = new BufferedWriter(new FileWriter(fileName, true));
                    outputFile.write(h);
                    outputFile.newLine();
                    outputFile.close();
            }
        } catch (Exception e) {
        }
    }
}
