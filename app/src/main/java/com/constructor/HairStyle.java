package com.constructor;

public class HairStyle {

    private String colour;
    private String type;

    public HairStyle (String colour, String type){
        this.colour=colour;
        this.type=type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "HairStyle{" +
                "colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    public static void main(String[] args) {

        HairStyle style = new HairStyle("grey", "permanent");
        System.out.println(style);
        System.out.println(style.getColour());
    }
}
