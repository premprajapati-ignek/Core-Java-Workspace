package com.ignek.core.java.basics;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class SwitchCase {
    public static void main(String[] args) {
        Day dayName = Day.MONDAY;
        switch (dayName){
            case MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY -> System.out.println("weekday");
            case SATURDAY, SUNDAY -> System.out.println("weekend");
        }
    }
}
