package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        while (!fileName.equals("exit")){
            new ReadThread(fileName).start();
            fileName = reader.readLine();
        }
        System.out.println(resultMap);
    }

    public static class ReadThread extends Thread {
        String fileName;
        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream stream = new FileInputStream(fileName);
                byte[] bytes = new byte[stream.available()];
                stream.read(bytes);
                int max = 0;
                for (int i = 0; i < bytes.length; i++) {
                    int a = bytes[i];
                    int n = 0;
                    for (int j = i + 1; j < bytes.length; j++) {
                        int b = bytes[j];
                        if (a == b){
                            n++;
                        }
                    }
                    if (n > max){
                        max = n;
                        resultMap.put(fileName, a);
                    }
                }
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
