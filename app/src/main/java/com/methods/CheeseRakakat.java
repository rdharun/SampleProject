package com.methods;

public class CheeseRakakat {

    public CheeseRakakat(){
        System.out.println("serving a cheese Rakakat");
    }

    public CheeseRakakat addIngredients(String cheese, String leaves, String seeds){
        System.out.printf("add shredded %s cheese, %s, toasted sesame seeds, %s leaves, and mix thoroughly in a bow", cheese,seeds,leaves);
        System.out.println();
        return this;
    }

    public CheeseRakakat fillSheet(){
        System.out.println("Spread an adequate amount of filling on the sheet, roll it over to from a log and seal the edges using some water");
        System.out.println("repeat the same procedure");
        return this;
    }

    public CheeseRakakat heatOil(){
        System.out.println("Heat the oil on medium flame in a deep pot or pan and deep fry the prepared cheese rolls until golden");
    return this;
    }

    public Rakakat serve(){
        System.out.println("Serve the cheese rolls with ketchup");
        return new Rakakat();
    }

    private static class  Rakakat{}

    public static void main(String[] args) {
        CheeseRakakat rakakat = new CheeseRakakat();
        rakakat.addIngredients("mozzarella","coriander","oregano")
                .fillSheet()
                .heatOil()
                .serve();
    }
}
