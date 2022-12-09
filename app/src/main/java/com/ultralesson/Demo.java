package com.ultralesson;

import com.google.common.base.Supplier;

public class Demo {

    public String convertNumberToString(int number) {
        return String.valueOf(number);
    }
    public static void main(String[] args) {
       
        Demo demo = new Demo();
        System.out.println(demo.convertNumberToString(44));


    }
}
