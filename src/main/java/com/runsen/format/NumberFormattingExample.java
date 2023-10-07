package com.runsen.format;

import java.util.Scanner;

public class NumberFormattingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入一个浮点数
        System.out.print("请输入一个浮点数：");
        double number = scanner.nextDouble();

        // 使用字符串格式化输出浮点数
        String formattedNumber = String.format("%.2f", number);
        System.out.println("格式化后的浮点数：" + formattedNumber);

        scanner.close();
    }
}