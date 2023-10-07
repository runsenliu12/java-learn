package com.runsen.string;


public class ImmutableStringExample {
    public static void main(String[] args) {
        String originalString = "Hello";
        String newString = originalString + ", World!";

        System.out.println("原始字符串：" + originalString);
        System.out.println("新字符串：" + newString);
    }
}