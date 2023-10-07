package com.runsen.base;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 创建一个 HashMap 对象
        Map<String, Integer> hashMap = new HashMap<>();

        // 添加键值对
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);

        // 获取值
        int age = hashMap.get("Alice");
        System.out.println("Alice's age is: " + age);

        // 检查键是否存在
        if (hashMap.containsKey("Bob")) {
            System.out.println("Bob is in the HashMap.");
        }

        // 检查值是否存在
        if (hashMap.containsValue(22)) {
            System.out.println("Someone is 22 years old in the HashMap.");
        }

        // 遍历键值对
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String name = entry.getKey();
            int value = entry.getValue();
            System.out.println(name + ": " + value);
        }

        // 删除键值对
        hashMap.remove("Charlie");
        System.out.println("After removing Charlie: " + hashMap);
    }
}
