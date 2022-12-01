package com.objects;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";

        if(s1.length()==s2.length()){

          String str1 =  s1.toLowerCase();
           String str2 = s2.toLowerCase();

          char[] ar1 = str1.toCharArray();
        char[] ar2 =   str2.toCharArray();

            Arrays.sort(ar1);
            Arrays.sort(ar2);

          boolean result =  Arrays.equals(ar1, ar2);

          if(result){
              System.out.println("it is anagram");
          } else {
              System.out.println("It is not");
          }
        }
        else {
            System.out.println("both not anagram");
        }
    }
}
