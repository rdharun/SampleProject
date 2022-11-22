package com.ultralesson;


import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exam {

    public static void main(String[] args) {

        Comparator<Stud> studComparator = new Comparator<Stud>() {

            @Override
            public int compare(Stud firstStud, Stud secondStud) {

                return firstStud.marks.compareTo(secondStud.marks);
            }
        };

        TreeSet<Stud> studSet = new TreeSet<>(studComparator);

        studSet.add(new Stud("Barrett lee",62));
        studSet.add(new Stud("Moore",29));
        studSet.add(new Stud("Nellie",18));
        studSet.add(new Stud("Jerrod",59));
        studSet.add(new Stud("Jack",70));
        studSet.add(new Stud("Andy",60));

         SortedSet<Stud> sortedSet =  studSet.tailSet(new Stud(35));
         sortedSet.forEach(System.out::println);


    }

    private static class Stud{
        private String name;
        private Integer marks;

        public Stud(Integer marks) {

            this.marks = marks;
        }

        public Stud(String name, Integer marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMarks() {
            return marks;
        }

        public void setMarks(Integer marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Stud{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
    }
    }



