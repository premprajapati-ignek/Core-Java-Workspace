package com.ignek.core.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllEmailAndPhoneNumber {
    public static void main(String[] args) {
        String text = "My email is premprajapati724@gmail.com and phone number is 9999988888";
        Pattern emailPattern = Pattern.compile("\\S+@\\S+");
        Pattern phoneNumberPattern = Pattern.compile("\\d{10}");

        Matcher emailMatcher = emailPattern.matcher(text);
        Matcher phoneNumberMatcher = phoneNumberPattern.matcher(text);

        if (emailMatcher.find()){
            System.out.println(emailMatcher.group());
        }

        if (phoneNumberMatcher.find()){
            System.out.println(phoneNumberMatcher.group());
        }

    }
}
