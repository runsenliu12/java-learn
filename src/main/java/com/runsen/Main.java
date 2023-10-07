package com.runsen;

import java.util.Scanner;

// 按两次 Shift 打开“随处搜索”对话框并输入 `show whitespaces`，
// 然后按 Enter 键。现在，您可以在代码中看到空格字符。
public class Main {
    public static void main(String[] args) {
        // 当文本光标位于高亮显示的文本处时按 Alt+Enter，
        // 可查看 IntelliJ IDEA 对于如何修正该问题的建议。
        System.out.printf("Hello and welcome!");

        // 按 Shift+F10 或点击装订区域中的绿色箭头按钮以运行脚本。
        for (int i = 1; i <= 5; i++) {

            // 按 Shift+F9 开始调试代码。我们已为您设置了一个断点，
            // 但您始终可以通过按 Ctrl+F8 添加更多断点。
            System.out.println("i = " + i);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个字符串: ");
        String str1 = scanner.nextLine();
        System.out.print("请输入第二个字符串: ");
        String str2 = scanner.nextLine();
        boolean contains = str1.contains(str2);
        System.out.println("第一个字符串是否包含第二个字符串: " + contains);
        scanner.close();

    }
}