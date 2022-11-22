package com.arraysexample;

import java.util.*;

public class Demo {
    public static void main(String args[]) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        System.out.println(numbers); // Random Order, may not be visible in small sets

        ArrayList<Integer> numbersList = new ArrayList<>(numbers);
        Collections.sort(numbersList);

        System.out.println(numbersList); // Sorted Order => 1,2,3,4,5
    }
}