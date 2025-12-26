package com.ignek.core.java.strings;

public class ReverseString {
    public static boolean isPalindrome(String string1){
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string1.charAt(string1.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void reverseString(String originalString){
        String reverse = "";
        for (int i = 0; i < originalString.length(); i++) {
            reverse += originalString.charAt(originalString.length()-i-1);
        }

        System.out.println("Reverse string is : " + reverse);
    }

    public static void main(String[] args) {
//        String string1 = "racecar";
        String string1 = "Hello";

        if (isPalindrome(string1)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }

        reverseString(string1);

    }
}
