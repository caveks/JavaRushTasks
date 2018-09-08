package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {

        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String countryName = customer.getCountryName();
            String countryCode = null;
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if(entry.getValue().equals(countryName)) {
                    countryCode = entry.getKey();
                }
            }
            return countryCode;
        }

        @Override
        public String getCompany() {
           return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String name = contact.getName();
            String[] s = name.split(" ");
            String contactFirstName = s[1];
            return contactFirstName;
        }

        @Override
        public String getContactLastName() {
            String name = contact.getName();
            String[] s = name.split(" ");
            String contactLastName = s[0].substring(0, s[0].length() - 1);
            return contactLastName;
        }

        @Override
        public String getDialString() {
            String phoneNumber = contact.getPhoneNumber();
            StringBuilder dialString = new StringBuilder();
            String[] s = phoneNumber.split("");
            for (int i = 0; i < s.length; i++) {
                if (!(s[i].equals("(") || s[i].equals(")") || s[i].equals("-"))){
                    dialString.append(s[i]);
                }
            }
            return "callto://" + dialString.toString();
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}