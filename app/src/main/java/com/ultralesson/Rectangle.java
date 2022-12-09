package com.ultralesson;

public class Rectangle {


    private int length;
    private int width;

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public void setLength(int length){
        this.length=length;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(14);
        rectangle.setWidth(6);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
