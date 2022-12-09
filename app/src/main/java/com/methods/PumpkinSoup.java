package com.methods;

public class PumpkinSoup {

    public PumpkinSoup(){
        System.out.println("serving a pumpkinSoup" );
    }
    public PumpkinSoup heatOil(){
        System.out.println("Heat the oil in the large pan over low heat");
        return this;
    }
    public PumpkinSoup addOnionAndLeek(int time){
        System.out.printf("Add the onion and leek for %s minutes until softened and not coloured", time);
        System.out.println();
        return this;
    }
    public PumpkinSoup addMore(int seconds){
        System.out.printf("Add garlic and spices and cook for %s seconds", seconds);
        System.out.println();
        return this;
    }
    public PumpkinSoup bringToBoil(){
        System.out.println("Add the pumpkin, potato, and stock and bring to the boil");
        return this;
    }
    public PumpkinSoup turnHeatToLow(int minutes){
        System.out.printf("Turn the stock heat to low and wait for %s minutes", minutes);
        System.out.println();
        return this;
    }
    public PumpkinSoup coolSlightly(){
        System.out.println("Allow to cool slightly and blend in batches");
        return this;
    }
    public PumpkinSoup soupToPan(){
        System.out.println("Return the soup to the pan and add the cream");
        System.out.println();
        return this;
    }
    public Pumpkin serve(){
        System.out.println("Serve the pumpkin");
        return new Pumpkin();
    }

    private static class Pumpkin{}

    public static void main(String[] args) {
        PumpkinSoup soup = new PumpkinSoup();
        soup.heatOil()
                .addOnionAndLeek(3)
                .addMore(30)
                .bringToBoil()
                .turnHeatToLow(30)
                .coolSlightly()
                .soupToPan()
                .serve();
    }
}
