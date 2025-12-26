package com.ignek.core.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employees{
    String name;
    int salary;

    Employees(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", salary : " + salary;
    }
}

public class SortEmployeeBySalary {
    public static void main(String[] args) {

        Comparator<Employees> comparator = new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.salary - o2.salary;
            }
        };

        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("Prem",22000 ));
        employees.add(new Employees("Rajesh",15000 ));
        employees.add(new Employees("Umang",25000 ));

        for (Employees employee : employees){
            System.out.println(employee.toString());
        }

        Collections.sort(employees, comparator);

        System.out.println();
        for (Employees employee : employees){
            System.out.println(employee.toString());
        }
    }
}
