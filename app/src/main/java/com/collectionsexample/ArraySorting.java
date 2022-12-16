package com.collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorting {


    public static void main(String[] args) {
        ArrayList<String> alphabets = new ArrayList<>(5);
        alphabets.add("C");
        alphabets.add("F");
        alphabets.add("A");
        alphabets.add("D");
        alphabets.add("B");


        Collections.reverse(alphabets);
        System.out.println(alphabets);

        Collections.sort(alphabets);
        System.out.println(alphabets);

        System.out.println("Using streams");

        List<String> stream = alphabets.stream().sorted().collect(Collectors.toList());
        System.out.println(stream);

        //sorting an arraylist in descending order

        System.out.println("using collection");
        Collections.sort(alphabets, Collections.reverseOrder());
        System.out.println(alphabets);


        //sorting an arraylist in descending order using streams

        System.out.println("Using streams");
        List<String> rev = alphabets.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(rev);

    }
}
