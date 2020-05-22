package com.ctra.integer;



public class IntegerTest02 {


    public static void main(String[] args) {
        Integer a1 = 88;
        Integer a2 = Integer.valueOf(88);
        Integer a3 = new Integer(88);

        System.out.println(a1==a2); // true
        System.out.println(a2==a3); // false
    }
}
