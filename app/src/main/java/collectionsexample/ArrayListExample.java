package collectionsexample;


import java.util.ArrayList;

public class ArrayListExample {

    public void replaceAll(){
        ArrayList<String> firstList = new ArrayList(5);
        firstList.add("a");
        firstList.add("b");
        firstList.add("c");
        firstList.add("d");

       //This method takes a single UnaryOperator type argument.
        firstList.replaceAll((alphabet) -> alphabet.toUpperCase());

        System.out.println(firstList);

    }


    public static void main(String[] args) {

        ArrayListExample list = new ArrayListExample();
        list.replaceAll();

    }
}
