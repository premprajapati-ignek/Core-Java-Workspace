package com.ignek.core.java.strings;

public class RemoveForbiddenWors {
    public static void main(String[] args) {
        String text = "This is hacker forbidden message";
        String forbiddenWords = "hacker|forbidden";

        String forbiddenText = text.replaceAll(forbiddenWords, "*****");

        System.out.println(forbiddenText);
    }
}
