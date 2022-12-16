package objects;

public class Point {

    private String colour;
    private String type;

    public Point(String colour, String type) {
        this.colour = colour;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        Point point = new Point("black", "circle");
        System.out.println(point.getColour());
        System.out.println(point.getType());
    }
}
