package com.ctra.integer;

import java.util.FormatFlagsConversionMismatchException;

// 【基本类型数组】与【包装类数组】之间不能自动装箱、拆箱
public class IntegerTest03 {
    public static void main(String[] args) {
        // ==================   ex1: 无法装箱   ==================
        int[] nums1 = {11, 22};
        //test1(nums1);// 无法装箱：值类型-引用类型


        Integer[] nums2 = new Integer[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = Integer.valueOf(nums1[i]);
        }

        // ==================   ex2: 无法拆箱  ==================
        Integer[] nums3 = {33, 44};
        //test2(nums3); //  无法拆箱：值类型-引用类型

        int[] nums4 = new int[nums3.length];
        for (int i = 0; i < nums3.length; i++) {
            nums4[i] = nums3[i].intValue();
        }

    }

    public static void test1(Integer[] nums) {
    }

    public static void test2(int[] nums) {
    }
}
