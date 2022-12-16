package singletonpattern;

public class Singleton {


    public static void main(String[] args) {

     //   ABC obj = ABC.getInstance();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Single obj = Single.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Single obj = Single.getInstance();
            }
        });

        t1.start();
        t2.start();




    }
}

//Singleton with eager initialization
    class ABC {
       static ABC obj = new ABC();

       private ABC(){

       }

       static ABC getInstance(){
           return obj;
       }

    }

    //Lazy initialization
    class Single{

    public static volatile Single obj;

    private Single(){
        System.out.println("Instance created");
    }

    static Single getInstance(){  //Double checked locking
        if(obj==null) {
            synchronized (Single.class) {
                if (obj == null) {
                    obj = new Single();
                }
            }
        }
        return obj;
    }
    }


