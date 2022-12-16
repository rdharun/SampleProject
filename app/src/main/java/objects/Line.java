package objects;

public class Line {
    private int width;
    private int inch;
    private String color;


    public Line (int width,int inch, String color){
        this.width=width;
        this.inch=inch;
        this.color=color;
    }

    public int getWidth(){
        return width;
    }
    public int getInch(){
        return inch;
    }
    public String getColor(){
        return color;
    }

    public static void main(String[] args) {
        Line line = new Line(2,4,"white");
        System.out.println(line.getColor());
    }


}
