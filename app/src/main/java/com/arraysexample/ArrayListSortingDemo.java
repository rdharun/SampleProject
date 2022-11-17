package com.arraysexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSortingDemo {


    public static void main(String args[]) {
        ArrayList<String> alphabets = new ArrayList<>(5);
        alphabets.add("C");
        alphabets.add("F");
        alphabets.add("A");
        alphabets.add("D");
        alphabets.add("B");

        System.out.println(alphabets);
        //Collections.sort(alphabets);
        //Collections.sort(alphabets, Collections.reverseOrder());
       // List<String> sorted = alphabets.stream().sorted().collect(Collectors.toList()); //using stream to sort
       List<String> sortedAlphabets = alphabets.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedAlphabets);
    }
}
