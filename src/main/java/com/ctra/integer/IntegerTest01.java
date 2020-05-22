package com.ctra.integer;

//public static Integer valueOf(int i) {
//        if (i >= IntegerCache.low && i <= IntegerCache.high)
//        return IntegerCache.cache[i + (-IntegerCache.low)];
//        return new Integer(i);
//}

import javax.xml.bind.SchemaOutputResolver;
@SuppressWarnings("all")
public class IntegerTest01 {
    public static void main(String[] args) {
        //Integer cache[]:-128 - 127
        Integer a1 = 88; //等价于  Integer.valueOf(88)
        Integer a2 = 88;
        Integer a3 = 888;
        Integer a4 = 888;

        // 不推荐
        System.out.println(a1==a2);  // true  都在chache内
        System.out.println(a3==a4);  // false
        // 推荐
        System.out.println(a1.equals(a2));  // true
        System.out.println(a3.equals(a4));  // true
    }
}
