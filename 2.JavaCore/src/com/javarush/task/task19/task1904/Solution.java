package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String sLine = fileScanner.nextLine();
            String[] s = sLine.split(" ");
            String firstName = s[1];
            String middleName = s[2];
            String lastName = s[0];
            String bDate = s[3] + " " + s[4] + " " + s[5];
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date birthDate = null;
            try {
                birthDate = format.parse(bDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Person person = new Person(firstName, middleName, lastName, birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
