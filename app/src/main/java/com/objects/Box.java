package com.objects;

public class Box {

    private String type;
    private String color;
    private int count;

    public Box (String type, String color, int count){
        this.type=type;
        this.color=color;
        this.count=count;
    }

    public String getColor(){
        return color;
    }

    public String getType(){
        return type;
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Box box = new Box("small", "white", 2);
        System.out.println(box.getColor());
    }




}
