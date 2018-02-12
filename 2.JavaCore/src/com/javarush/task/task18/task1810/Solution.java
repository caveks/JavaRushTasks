package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);


//                       1-й вариант
//      while (true) {
//            int n = 0;
//            while (inputStream.available() > 0) {
//                inputStream.read();
//                n++;
//            }
//
//            if (n < 1000) {
//                reader.close();
//                inputStream.close();
//                throw new DownloadException();
//            } else {
//                fileName = reader.readLine();
//                inputStream = new FileInputStream(fileName);
//            }
//        }
//    }
//              2-й вариант
        while (true) {
            if (inputStream.available() < 1000) {
                reader.close();
                inputStream.close();
                throw new DownloadException();
            } else {
                fileName = reader.readLine();
                inputStream = new FileInputStream(fileName);
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}