package collectionsexample;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsChallenge {


    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));


       // System.out.println("The Student names in class 6");


        List<Student> res =  students.stream().filter(stu -> stu.getClassNo()==6).collect(Collectors.toList());
        res.forEach(System.out::println);

        System.out.println("The Student above age 8");
        for (Student student: students) {
            if(student.getAge()>8)
                System.out.println(student);
        }


        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
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
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getClassNo() {
            return classNo;
        }

        public void setClassNo(int classNo) {
            this.classNo = classNo;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classNo=" + classNo +
                    '}'+"\n";
        }
    }

}