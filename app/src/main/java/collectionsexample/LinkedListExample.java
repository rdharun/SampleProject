package collectionsexample;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {


        LinkedList<String> alphabets1 = new LinkedList<>();
        alphabets1.add("D");
        alphabets1.add("E");

        LinkedList<String> alphabets = new LinkedList<>();

        alphabets.add("B");
        alphabets.addFirst("A");
        alphabets.add(2,"C");
        alphabets.addAll(alphabets1);
        alphabets.add(null);
        System.out.println(alphabets);

       String first =  alphabets.getFirst();
        System.out.println(first);
        String last =  alphabets.getLast();
        System.out.println(last);



    }
}
