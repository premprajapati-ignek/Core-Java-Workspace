package com.ignek.core.java.strings;

public class StringReplaceToMask {
    public static void main(String[] args) {
        String text = "My email is prajapatiprem724@gmail.com and phone number is 9999999999";

        String emailMask = text.replaceAll("(\\S)[a-zA-Z0-9]*(@\\S+)", "$1*****$2");
        String phoneNumberMask = text.replaceAll("\\d{6}(\\d{4})", "******$1");

        System.out.println(emailMask);
        System.out.println(phoneNumberMask);
    }
}
