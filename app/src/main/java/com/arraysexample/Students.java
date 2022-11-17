package com.arraysexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {

    private static class Student{

        private String name;
        private int age;
        private  int classno;

        public Student(String name, int age, int classno) {
            this.name = name;
            this.age = age;
            this.classno = classno;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classno=" + classno +
                    '}';
        }

        public String getName() {
            if(age>8){
                System.out.println(name);
            }
         return name;
        }

        public String getClassNumName(){
            if(classno==8){
                System.out.println(name);
            }
            return name;
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        System.out.println(students);
    }


}
