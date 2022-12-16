package collectionsexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListIterators {

    public void iterators(){

        ArrayList<String> alphabets = new ArrayList<>(5);
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");

        Iterator<String>  itr =alphabets.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }

        System.out.println();
        System.out.println("Using for each remaining");

        Iterator<String> newItr = alphabets.iterator();
        newItr.forEachRemaining(alphabet -> System.out.print(alphabet));
    }

    public void listIterator() {
        ArrayList<String> alphabets = new ArrayList<>(5);
        alphabets.add("A");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        alphabets.add("F");

        ListIterator<String> listIterator = alphabets.listIterator();

        System.out.println();
        System.out.println("Forward Iteration:");
        System.out.println("----------------------");
        while (listIterator.hasNext()) {
            System.out.println("Current element is " + listIterator.next());

        }

        System.out.println();
        System.out.println("Backward Iteration:");
        System.out.println("----------------------");

        while (listIterator.hasPrevious()) {
            System.out.println("Current element is " + listIterator.previous());
        }
    }
    public static void main(String[] args) {

        ArrayListIterators li = new ArrayListIterators();
        li.iterators();
        li.listIterator();

    }
    }

