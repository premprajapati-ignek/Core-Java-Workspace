package com.ignek.core.java.strings;

public class CountCharacter {
    public static void main(String[] args) {

        //ascii values capital letter start with 65 and small letter start with 97

        String string1 = "Prem@#1234 _";
        char characterArray[] = string1.toCharArray();
        int chracterAsciiValues[] = new int[256];

        for (char characterAscii : characterArray){
            chracterAsciiValues[characterAscii]++;
        }

        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        int numbers = 0;
        int specialCharacter = 0;

        for (int i = 0; i < chracterAsciiValues.length; i++) {
            if (chracterAsciiValues[i] > 0){
                char character = (char) i;
                System.out.println( character + " occurrence is " + chracterAsciiValues[i]);

                if (character>='a' && character<='z' || character>='A' && character<='Z'){

                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                        vowels += chracterAsciiValues[i];
                    } else {
                        consonants += chracterAsciiValues[i]++;
                    }

                }else if (character == ' '){
                    spaces = chracterAsciiValues[i];
                } else if (character >= '0' && character <='9') {
                    numbers += chracterAsciiValues[i];
                } else {
                    specialCharacter += chracterAsciiValues[i];
                }
            }
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Spaces : " + spaces);
        System.out.println("Number : " + numbers);
        System.out.println("Special character : " + specialCharacter);
    }
}
