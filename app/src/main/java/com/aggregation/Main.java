package com.aggregation;

public class Main {
    public static void main(String[] args) {
        Charger charger = new Charger();
        Mobile mobile = new Mobile(charger);
        mobile.charge();

        Ipad ipad = new Ipad(charger);
        ipad.charge();

    }
}
