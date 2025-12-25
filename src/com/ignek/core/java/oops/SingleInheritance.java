package com.ignek.core.java.oops;

class Employee{
    int experience;
    String department;

    Employee(){
        System.out.println("This is employee");
    }
}

class Manager extends Employee{
    String name;

    Manager(){
        System.out.println("This employee is manager");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.name = "Prem";
        manager1.experience = 0;
        manager1.department = "IT";

        System.out.println("\noops.Manager name : " + manager1.name);
        System.out.println("oops.Manager experience : " + manager1.experience);
        System.out.println("oops.Manager department : " + manager1.department);
    }
}
