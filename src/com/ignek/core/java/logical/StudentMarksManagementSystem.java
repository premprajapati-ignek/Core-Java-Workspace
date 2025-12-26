package com.ignek.core.java.logical;

import java.util.Scanner;

class Student{
    int studentId;
    int subject[];
    int total;
    double average;
    char grades;

    Student(int studentId){
        this.studentId = studentId;
    }
}

public class StudentMarksManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of student : ");
        int countStudent = sc.nextInt();

        System.out.println("Enter numbers of subjects : ");
        int countSubject = sc.nextInt();

        Student students[] = new Student[countStudent];
        int counter = 0;

        for (Student student : students){

            student = new Student(counter += 1);

            student.subject = new int[countSubject];
            int totalMarks = 0;
            for (int i = 0; i < student.subject.length; i++) {
                System.out.println("logicalPrograms.Student"+ student.studentId + " enter subject" + (i+1) + " marks");
                int subjectMarks = sc.nextInt();
                student.subject[i] = subjectMarks;
                totalMarks += student.subject[i];
            }
            student.total = totalMarks;

            student.average = student.total / student.subject.length;

            if (student.average <= 100  && student.average >= 90)
                student.grades = 'A';
            else if (student.average <= 91  && student.average >= 80) {
                student.grades = 'B';
            } else if (student.average <= 81  && student.average >= 70) {
                student.grades = 'C';
            } else if (student.average <= 71  && student.average >= 60) {
                student.grades = 'D';
            } else {
                student.grades = '-';
            }

            System.out.println("\nStudentId : " + student.studentId);
            for (int i = 0; i < student.subject.length; i++) {
                System.out.println("Subject" + (i+1) + " marks : " + student.subject[i]);
            }
            System.out.println("Total marks : " + student.total);
            System.out.println("Average marks : " + student.average);
            System.out.println("Grade : " + student.grades);
        }
        sc.close();
    }
}
