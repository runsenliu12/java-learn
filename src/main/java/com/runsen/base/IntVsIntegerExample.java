package com.runsen.base;

public class IntVsIntegerExample {
    public static void main(String[] args) {
        // 使用 int
        int primitiveInt = 42; // 声明一个int变量并初始化
        int sum1 = primitiveInt + 10; // 可以直接进行数学运算

        // 不能表示null值，以下代码会引发编译错误
        // int nullValue = null;

        // 使用 Integer
        Integer boxedInt = new Integer(42); // 声明一个Integer对象并初始化
        Integer sum2 = boxedInt + 10; // 自动拆箱（unboxing）为int进行数学运算

        Integer nullValue = null; // 可以表示null值

        // 使用一些Integer的方法
        String str = boxedInt.toString(); // 转换成字符串
        int intValue = boxedInt.intValue(); // 转换成int

        System.out.println("Using int: " + sum1);
        System.out.println("Using Integer: " + sum2);
        System.out.println("Integer to String: " + str);
        System.out.println("Integer to int: " + intValue);
        System.out.println("Null Integer: " + nullValue);
    }
}