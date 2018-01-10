package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 3) {
                        if (args[i + 1].equals("м")) {
                            try {
                                allPeople.add(Person.createMale(args[i], dateFormat.parse(args[i + 2])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            System.out.println(allPeople.size() - 1);
                        } else if (args[i + 1].equals("ж")) {
                            try {
                                allPeople.add(Person.createFemale(args[i], dateFormat.parse(args[i + 2])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            System.out.println(allPeople.size() - 1);
                        }
                    }
                    break;
                }

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i = i + 4) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(args[i + 1]);
                            if (args[i + 2].equals("м")) {
                                person.setSex(Sex.MALE);
                            } else {
                                person.setSex(Sex.FEMALE);
                            }
                            try {
                                person.setBirthDay(dateFormat.parse(args[i + 3]));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        Person person = allPeople.get(Integer.parseInt(args[i]));
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                            if (person.getSex().equals(Sex.MALE)) {
                                System.out.println(person.getName() + " м " + simpleDateFormat.format(person.getBirthDay()));
                            } else {
                                System.out.println(person.getName() + " ж " + simpleDateFormat.format(person.getBirthDay()));
                            }
                    }
                }
                break;
        }
    }
}