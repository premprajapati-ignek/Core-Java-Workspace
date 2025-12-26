package com.ignek.core.java.thread;

class BookingSystem extends Thread{
    int availableTickets = 2;

    BookingSystem(String userName){
        super(userName);
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (availableTickets > 0){
            System.out.println(threadName + "trying to book ticket");
            availableTickets--;
            System.out.println(threadName + "ticket is booked successfully, And available ticket is : " + availableTickets);
        } else {
            System.out.println("sorry, ticket is not available");
        }
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        BookingSystem user1 = new BookingSystem("Prem");
        BookingSystem user2 = new BookingSystem("Rajesh");
        BookingSystem user3 = new BookingSystem("Umang");

        user1.start();
        user2.start();
        user3.start();
    }
}
