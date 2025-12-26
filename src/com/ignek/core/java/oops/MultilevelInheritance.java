package com.ignek.core.java.oops;

class User{
    User(){
        System.out.println("This is free user");
    }
}

class Member extends User{
    Member(){
        System.out.println("This is member");
    }
}

class PremiumMember extends Member{
    PremiumMember(){
        System.out.println("This is premium member");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        PremiumMember premiumMember1 = new PremiumMember();
    }
}
