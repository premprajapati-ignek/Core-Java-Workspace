package com.ignek.core.java.oops;

import java.util.Scanner;

class StudentRecord{
    int rollNo;
    String studentName;
    int marks;

    StudentRecord(  int rollNo, String studentName, int marks){
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class MaintainSchoolRecord {

    public static void showStudents(StudentRecord studentRecords[]){
        System.out.println("\nStudents : ");
        for (StudentRecord student : studentRecords){
            System.out.println("\nStudentId : " + student.rollNo);
            System.out.println("Total marks : " + student.studentName);
            System.out.println("Average marks : " + student.marks);
        }
    }

    public static void inputStudents(StudentRecord studentRecords[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < studentRecords.length; i++) {

            System.out.println("Enter student" + (i+1) + " roll number : ");
            int studentRollno = sc.nextInt();
            System.out.println("Enter student" + (i+1) + " name : ");
            String studentName = sc.next();
            System.out.println("Enter student" + (i+1) + " marks : ");
            int studentMarks = sc.nextInt();

            studentRecords[i] = new StudentRecord(studentRollno, studentName, studentMarks);
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many student do you enter : ");
        int numberOfStudent = sc.nextInt();

        StudentRecord studentRecords[] = new StudentRecord[numberOfStudent];

        inputStudents(studentRecords);
        showStudents(studentRecords);
        sc.close();
    }
}
