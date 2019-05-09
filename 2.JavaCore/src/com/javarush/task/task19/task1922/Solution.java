package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String fileName = reader.readLine();

      FileReader fileReader = new FileReader(fileName);
      Scanner scan = new Scanner(fileReader);
      while (scan.hasNextLine()){
        String s = scan.nextLine();
        String[] list = s.split(" ");
        int a = 0;
          for (int i = 0; i < words.size(); i++) {
              for (int j = 0; j < list.length; j++) {
                  if (words.get(i).equals(list[j])){
                      a++;
                  }
              }
          }
          if (a == 2) {
              System.out.println(s);
          }
        }
      reader.close();
      fileReader.close();
    }
}
