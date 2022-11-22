package com.aggregation;

public class Ipad {
    private Charger charger;


    public Ipad (Charger charger){
        this.charger=charger;
    }

    public void charge(){
        this.charger.charge("Ipad");
    }
}
