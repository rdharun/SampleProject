package collectionsexample;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String args[]) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.forEach(System.out::println);
    }
}

