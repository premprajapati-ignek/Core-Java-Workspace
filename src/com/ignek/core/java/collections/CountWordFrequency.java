package com.ignek.core.java.collections;

import java.util.HashMap;

public class CountWordFrequency {
    public static void main(String[] args) {
        String text = "this is boy and this is girl";
        HashMap<String, Integer> wordAndItsValue = new HashMap<>();

        String words[] = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            Integer wordValue = wordAndItsValue.get(words[i]);
//            if (wordValue == null){
//                wordAndItsValue.put(words[i], 1);
//            } else {
//                wordAndItsValue.put(words[i], wordValue + 1);
//            }
            if (wordAndItsValue.containsKey(words[i])){
                wordAndItsValue.put(words[i], wordValue + 1);
            } else {
                wordAndItsValue.put(words[i], 1);
            }
        }
        System.out.println(wordAndItsValue);
    }
}
