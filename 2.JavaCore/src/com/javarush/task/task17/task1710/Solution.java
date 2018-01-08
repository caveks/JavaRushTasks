package com.javarush.task.task17.task1710;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        if((args[0].equals("-c")) && (args[2].equals("м"))) {
            try {
                allPeople.add(Person.createMale(args[1], dateFormat.parse(args[3])));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(allPeople.size() - 1);
        } else if ((args[0].equals("-c")) && (args[2].equals("ж"))) {
            try {
                allPeople.add(Person.createFemale(args[1], dateFormat.parse(args[3])));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(allPeople.size() - 1);
        } else if (args[0].equals("-u")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);
                if (args[3].equals("м")){
                    person.setSex(Sex.MALE);
                } else {
                    person.setSex(Sex.FEMALE);
                }
                try {
                    person.setBirthDay(dateFormat.parse(args[4]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
        } else if (args[0].equals("-d")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        } else if (args[0].equals("-i")) {
            Person person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                if (person.getSex().equals(Sex.MALE)){
                    System.out.println(person.getName() + " м " + simpleDateFormat.format(person.getBirthDay()));
                } else {
                    System.out.println(person.getName() + " ж " + simpleDateFormat.format(person.getBirthDay()));
                }
        }
    }
}