package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        FileReader reader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(reader);

        while (bufferedReader.ready()){
            boolean b;
            StringBuilder name = new StringBuilder();
            StringBuilder date = new StringBuilder();
            String[] s = bufferedReader.readLine().split("\\s+");
            for (int i = 0; i < s.length; i++) {
                try {
                    Integer.parseInt(s[i]);
                    b = false;
                } catch (NumberFormatException e) {
                    b = true;
                }
                if (b == true){
                    name.append(s[i] + " ");
                } else {
                    date.append(s[i] + " ");
                }
            }
        String nameString = name.toString();
        String dateString = date.toString();
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        Date d = format.parse(dateString);
        Person p = new Person(nameString.trim(), d);
        PEOPLE.add(p);
        }
        reader.close();
    }
}
