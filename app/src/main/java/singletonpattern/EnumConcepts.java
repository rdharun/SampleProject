package singletonpattern;

public class EnumConcepts {

    public static void main(String[] args) {

        Abc obj1 = Abc.INSTANCE;
        obj1.i=5;
        obj1.show();

        Abc obj2 = Abc.INSTANCE;
        obj2.i=6;
        obj1.show();
    }


}

enum Abc {  //special type of class
    INSTANCE;  //public static Abc getInstance(){}
    int i;
    public void show(){
        System.out.println(i);
    }
}
