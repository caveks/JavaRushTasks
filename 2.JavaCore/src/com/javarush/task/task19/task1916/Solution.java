package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws Exception{
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        String file1 = fileName.readLine();
        String file2 = fileName.readLine();
        fileName.close();

        FileReader fileReader1 = new FileReader(file1);
        BufferedReader reader1 = new BufferedReader(fileReader1);
        FileReader fileReader2 = new FileReader(file2);
        BufferedReader reader2 = new BufferedReader(fileReader2);

        String s1 = null;
        String s2 = null;
        try {
            while (true){
            reader1.mark(1000);
            reader2.mark(1000);
            s1 = reader1.readLine();
            s2 = reader2.readLine();
                if (s1.equals(s2)) {
                    lines.add(new LineItem(Type.SAME, s1));
                } else {
                    if (s1.equals(reader2.readLine())){
                        reader2.reset();
                        s2 = reader2.readLine();
                        lines.add(new LineItem(Type.ADDED, s2));
                        reader1.reset();
                    } else {
                        lines.add(new LineItem(Type.REMOVED, s1));
                        reader2.reset();
                    }
                }
        }
        } catch (Exception e){
        }
        if (s1 == null && s2 != null){
            reader2.reset();
            s2 = reader2.readLine();
            lines.add(new LineItem(Type.ADDED, s2));
        }
        fileReader1.close();
        fileReader2.close();
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
