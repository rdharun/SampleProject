package com.aggregation;

public class Mobile {

    private Charger charger;

    public Mobile(Charger charger){
        this.charger=charger;
    }

    public void charge(){

        this.charger.charge("Mobile");
    }

}
