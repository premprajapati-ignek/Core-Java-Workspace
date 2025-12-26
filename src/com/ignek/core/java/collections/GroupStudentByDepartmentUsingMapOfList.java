package com.ignek.core.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
    String name;
    String department;

    Student(String name, String department){
        this.name = name;
        this.department = department;
    }
}

public class GroupStudentByDepartmentUsingMapOfList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("prem", "computer science"));
        studentList.add(new Student("rajesh", "electrical engineering"));
        studentList.add(new Student("umang", "mechanical engineering"));
        studentList.add(new Student("keyur", "computer science"));
        studentList.add(new Student("vivek", "electrical engineering"));

        Map<String, ArrayList<Student>> studentByDepartment = new HashMap<>();

        for (Student student : studentList){
            String department = student.department;
            if (!studentByDepartment.containsKey(department)){
                studentByDepartment.put(department, new ArrayList<>());
            }
            studentByDepartment.get(department).add(student);
        }

        for (Map.Entry<String, ArrayList<Student>> entry : studentByDepartment.entrySet()){
            String department = entry.getKey();
            List<Student> studentListByDepartment = entry.getValue();
            System.out.println("Department : " + department);
            for (Student student : studentListByDepartment){
                System.out.print(student.name   + ", ");
            }
            System.out.println("\n");
        }
    }
}
