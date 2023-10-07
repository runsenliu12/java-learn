package com.runsen.format;

import java.util.Scanner;

public class StringFormattingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入姓名
        System.out.print("请输入您的姓名：");
        String name = scanner.nextLine();

        // 提示用户输入年龄
        System.out.print("请输入您的年龄：");
        int age = scanner.nextInt();

        // 使用字符串格式化输出姓名和年龄
        String formattedOutput = String.format("姓名：%s\n年龄：%d", name, age);
        System.out.println(formattedOutput);

        scanner.close();
    }
}