package com.methods;

public class CoffeeMaker {



        public CoffeeMaker() {
            System.out.println("preparing a coffee ");
        }

        public CoffeeMaker addSugarAndInstantCoffee(double instant, double sugar) {

            System.out.printf("preparing %s tablespoons sugar with %s with coffee", sugar, instant);
            System.out.println();
            return this;

        }

        public CoffeeMaker addWater(int water) {
            System.out.printf("Adding a %s tablespoons of water to the coffee ", water);
            System.out.println();
            return this;
        }

        public CoffeeMaker mix() {
            System.out.println("Mix a coffee and sugar with water");
            return this;
        }

        public CoffeeMaker addTime(int time) {
            System.out.println("Adding time to a coffee mix " + time);
            return this;
        }

        public CoffeeMaker pour(double milkQuantity) {
            System.out.printf("Adding %s cup milk to the coffee mix",milkQuantity);
            System.out.println();
            return this;
        }

        public Coffee server() {
            System.out.println("serving the coffee");
            return new Coffee();
        }

    private static class Coffee {}

    public static void main(String[] args) {
            CoffeeMaker maker = new CoffeeMaker();
            maker.addSugarAndInstantCoffee(1.5, 1.5)
                    .addWater(3)
                    .mix()
                    .addTime(3)
                    .pour(0.5)
                    .server();
        }
    }

