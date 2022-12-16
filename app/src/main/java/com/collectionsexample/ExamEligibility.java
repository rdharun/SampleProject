package com.collectionsexample;

import java.util.Comparator;
import java.util.TreeSet;

public class ExamEligibility {

    public static void main(String[] args) {

        TreeSet<Students> set = new TreeSet<>(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if(o1.marks>35){
                    System.out.println(o1.names);
                }
                return 0;
            }
        });
        set.add(new Students("Barrett lee",62));
        set.add(new Students("Moore",29));
        set.add(new Students("Nellie",18));
        set.add(new Students("Jerrod",59));
        set.add(new Students("Jack",70));
        set.add(new Students("Andy",60));



    }

   private static class Students {

        private String names;
        private int marks;

        public Students(String names, int marks){
            this.names=names;
            this.marks=marks;
        }

       @Override
       public String toString() {
           return "Students{" +
                   "names='" + names + '\'' +
                   ", marks=" + marks +
                   '}';
       }
   }

}
