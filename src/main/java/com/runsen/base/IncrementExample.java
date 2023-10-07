package com.runsen.base;

public class IncrementExample {
    public static void main(String[] args) {
        int i = 5;

        // 后缀递增操作符示例
        int result1 = i++;
        System.out.println("后缀递增操作符示例：");
        System.out.println("result1 = " + result1); // 输出：result1 = 5
        System.out.println("i = " + i);             // 输出：i = 6

        // 前缀递增操作符示例
        int j = 5;
        int result2 = ++j;
        System.out.println("\n前缀递增操作符示例：");
        System.out.println("result2 = " + result2); // 输出：result2 = 6
        System.out.println("j = " + j);             // 输出：j = 6
    }
}