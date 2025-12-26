package com.ignek.core.java.strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        String usingTemplateLiteral = "Hello, prem - string constant pool";
        String usingNewKeyword = new String("Hello world! - heap");

        System.out.println(usingTemplateLiteral);
        System.out.println(usingNewKeyword);

        System.out.println();
        Scanner sc = new Scanner(System.in);
//        String string1 = sc.next();
        String string1 = "hello world!";

        System.out.println(string1);
        System.out.println("Length is : " + string1.length());
        System.out.println("Converting to uppercase : " + string1.toUpperCase());
        System.out.println("Converting to lowercase : " + string1.toLowerCase());
//        System.out.println(string1.indexOf('r'));
//        System.out.println(string1.charAt(1));

        System.out.println();
        String string2 = "this is string with keyword";
        String keyword = "keyword";

        boolean isContain = string2.contains(keyword);
        System.out.println(string2);
        System.out.println("'keyword' is contain : " + isContain);

        System.out.println();
        String string3 = "IGNEK";
        String string4 = "Prem";
        String string5 = "IGNEK";

        if (string3.equals(string5)){
            System.out.println("Both string are equal");
        } else {
            System.out.println("Both string are not-equal");
        }

        if (string3.equals(string4)){
            System.out.println("Both string are equal");
        } else {
            System.out.println("Both string are not-equal");
        }

        String string6 = "this is longer string";
        System.out.println(string6.substring(15));
        sc.close();
    }
}
