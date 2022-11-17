package com.objects;

public class Pencil
{

   private String color;
    private String type;
    private  int count;


    public Pencil(String color, String type, int count) {
        this.color = color;
        this.type = type;
        this.count = count;
    }


    public String getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        Pencil pencil = new Pencil("red", "tipPencil", 1);
        System.out.println(pencil.getColor());

    }

}
