package com.ignek.core.java.collections;

import java.util.ArrayList;

class Stack{
    ArrayList<Integer> arrayList = new ArrayList<>();

    public void push(int element){
        arrayList.add(element);
    }

    public int pop(){
        return arrayList.removeLast();
    }

    public int peek(){
        return arrayList.getLast();
    }

    public boolean isEmpty(){
        if (arrayList.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public int size(){
        return arrayList.size();
    }
}

public class CreateCustomStackUsingArrayList {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);

        System.out.println("Remove element(pop) : " + stack1.pop());
        System.out.println("Return last element(peek) : " + stack1.peek());
        System.out.println("Stack is empty(isEmpty) : " + stack1.isEmpty());
        System.out.println("Return size of stack : " + stack1.size());
    }
}
