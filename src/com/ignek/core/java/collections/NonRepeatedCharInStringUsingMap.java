package com.ignek.core.java.collections;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharInStringUsingMap {
    public static void main(String[] args) {
        String text = "racecar";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            Character character = text.charAt(i);
            Integer isContainCharacter = map.get(character);
            if (isContainCharacter == null){
                map.put(character, 1);
            } else {
                map.put(character, isContainCharacter + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            char character = entry.getKey();
            int count = entry.getValue();
            if (!(count > 1)){
                System.out.println("Non repeated character is : " + character);
            }
        }

        System.out.println(map);
    }
}
