package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.nio.channels.UnresolvedAddressException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter (IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
           return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String code = data.getCountryCode();
            String country = null;
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if(entry.getKey().equals(code)) {
                    country = entry.getValue();
                }
            }
            return country;
        }

        @Override
        public String getName() {
            String name = data.getContactFirstName();
            String surname = data.getContactLastName();
            return surname + ", " + name;
        }

        @Override
        public String getPhoneNumber() {
            int phoneCodeCountry = data.getCountryPhoneCode();
            String phoneNumber = String.valueOf(String.format("%010d", data.getPhoneNumber()));
            String pNumber = String.format("+%d(%s)%s-%s-%s", phoneCodeCountry, phoneNumber.substring(0, 3), phoneNumber.substring(3, 6), phoneNumber.substring(6, 8), phoneNumber.substring(8, 10));
            return pNumber;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}