package com.runsen.base;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一段文本：");
        String text = scanner.nextLine();

        // 将文本分割成单词，并统计出现次数
        String[] words = text.split("\\s+"); // 使用空格分割单词
        for (String word : words) {
            word = word.toLowerCase(); // 忽略大小写
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // 输出单词及其出现次数
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
