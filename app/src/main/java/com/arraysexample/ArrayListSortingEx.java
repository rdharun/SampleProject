package com.arraysexample;

import java.util.*;

public class ArrayListSortingEx {

    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);  //compare by name
                //return Integer.compare(o1.age,o2.age);
               // return Integer.compare(o1.classNo,o2.classNo);

                 /*int names = o1.name.compareTo(o2.name);

                if(names == 0)
                    names = Integer.compare(o1.age,o2.age);
                return names;*/
            }
        });
        System.out.println(students);
    }

    private static class Student {
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
            getAge();
            getClassNo();
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classNo=" + classNo +
                    '}';
        }
        public String getAge() {
            if(age>8) {
                System.out.println("The Students those who are above age 8 :"+name);
            }
            return name;
        }
        public String getClassNo() {
            if(classNo==6){
                System.out.println("The Students those who are in class 6 :"+name);
            }
            return name;
        }
        }
    }

