package com.ultralesson;

public class Boy {
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age=0;
            System.out.println("error");
        } else {
            this.age=age;
        }
    }


    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setAge(4);
        boy.setAge(2);
        System.out.println(boy.getAge());
    }
}
