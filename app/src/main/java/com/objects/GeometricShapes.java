package com.objects;

public class GeometricShapes {

    private String shape;

   public GeometricShapes(String shape){
        this.shape=shape;
    }

    public String getShape(){
        return shape;
    }

    public static void main(String[] args) {

        GeometricShapes shapes = new GeometricShapes("circle");
        System.out.println(shapes.getShape());
    }
}
