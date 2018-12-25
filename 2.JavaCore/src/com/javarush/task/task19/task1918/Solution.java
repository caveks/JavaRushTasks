package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        String tag = args[0];
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder builder = new StringBuilder();
        while(bufferedReader.ready()) {
            builder.append(bufferedReader.readLine());
        }

        Document doc = Jsoup.parse(builder.toString(), "", Parser.xmlParser());
        Elements form = doc.select(tag);
        System.out.println(form);
        fileReader.close();
        bufferedReader.close();
    }
}
