package com.ignek.core.java.strings;

public class SmallOperationInMutableString {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Good morning");
        System.out.println(stringBuilder1.length());
        System.out.println(stringBuilder1.capacity());
    }
}
