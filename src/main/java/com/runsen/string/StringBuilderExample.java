package com.runsen.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            stringBuilder.append(i);
        }

        String result = stringBuilder.toString();
        System.out.println(result);
    }
}