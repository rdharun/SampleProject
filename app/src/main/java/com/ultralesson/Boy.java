package com.ultralesson;

public class Boy {

    private int age=0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setAge(4);
        boy.setAge(2);
        System.out.println(boy.getAge());
    }
}
