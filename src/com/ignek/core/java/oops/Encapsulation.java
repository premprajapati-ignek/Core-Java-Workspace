package com.ignek.core.java.oops;

class UserProfile{
    private String name;
    private String email;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        UserProfile user1 = new UserProfile();

        user1.setName("Prem");
        user1.setAge(21);
        user1.setEmail("prajapatiprem724@gmail.com");

        System.out.println("Name : " + user1.getName());
        System.out.println("Age : " + user1.getAge());
        System.out.println("oops.Email : " + user1.getEmail());
    }
}
