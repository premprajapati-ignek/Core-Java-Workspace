package com.ignek.core.java.collections;

import java.util.HashMap;
import java.util.Map;

public class ContactBookUsingHashMap {
    public static void main(String[] args) {
        HashMap<String, String> contactBook = new HashMap<>();
        contactBook.put("prem", "9898989898");
        contactBook.put("rajesh", "7676767676");
        contactBook.put("umang", "9090909090");
        contactBook.put("vivek", "6565656565");

        System.out.println("Contact Book : ");
        for (Map.Entry<String, String> entry : contactBook.entrySet()){
            String name = entry.getKey();
            String contactNo = entry.getValue();
            System.out.println("Name : " + name + ", contact : " + contactNo);
        }
    }
}
