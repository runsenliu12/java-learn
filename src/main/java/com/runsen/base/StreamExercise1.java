package com.runsen.base;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamExercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0) // 过滤出偶数
                .mapToDouble(n -> n) // 转换为Double流
                .average(); // 计算平均值

        if (average.isPresent()) {
            System.out.println("偶数的平均值：" + average.getAsDouble());
        } else {
            System.out.println("没有偶数");
        }
    }
}
