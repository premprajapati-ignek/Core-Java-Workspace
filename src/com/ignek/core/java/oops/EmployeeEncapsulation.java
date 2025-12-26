package com.ignek.core.java.oops;

class EmployeeClass{
    private String position;
    private int salary;
    private int age;

    public void setPosition(String position){
        this.position = position;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPosition(){
        return this.position;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getAge(){
        return age;
    }
}

class EmployeeEncapsulation{
    public static void main(String[] args) {
        EmployeeClass employee1 = new EmployeeClass();
        employee1.setPosition("Trainee software developer");
        employee1.setAge(21);
        employee1.setSalary(22000);

        System.out.println("oops.Employee position : " + employee1.getPosition());
        System.out.println("oops.Employee age : " + employee1.getAge());
        System.out.println("oops.Employee salary : " + employee1.getSalary());
    }
}