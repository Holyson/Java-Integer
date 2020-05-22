package com.ctra.integer;

import java.util.Arrays;

public class Asked {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1, 2, 3, 4, 5};
        MyDate my = new MyDate();

        change(i,str,num,arr,my);

        System.out.println(i);
        System.out.println(str);
        System.out.println(num);
        System.out.println(Arrays.toString(arr));
        System.out.println(my.a);

    }

    public static void change(int j, String s, Integer n, int[] a, MyDate m) {
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
    }
}

class MyDate {
    int a = 10;
}
