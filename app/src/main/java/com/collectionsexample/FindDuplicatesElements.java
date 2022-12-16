package com.collectionsexample;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesElements {

        public static void main(String args[]) {
            int[] numbers = {1,55,666,43434,11212,11323, 55,22,33,546,64342,232,5432,2444,113,333,666,4533,232};
            // logic
            System.out.println("Using brute force");
            for(int i=0; i<numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                       System.out.println(numbers[i]);
                    }
                }
            }
            System.out.println("using hashset");

            Set<Integer> integerSet = new HashSet<>();
            for (Integer num: numbers) {
                if(integerSet.add(num)==false){
                    System.out.println(num);
                }
            }
            }
            }




