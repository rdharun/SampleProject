package constructor;

public class Apple {

    private String type;
    private String stage;


    public Apple (String type, String stage){
        this.type=type;
        this.stage=stage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", stage='" + stage + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Apple apple = new Apple("sweet","jazz");
        System.out.println(apple);
        System.out.println(apple.getType());

    }
}

