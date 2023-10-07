package com.runsen.base;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExercise2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

// 使用流操作计算数组中所有偶数的平方和
        int sumOfEvenSquares = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sum();

        System.out.println("偶数的平方和: " + sumOfEvenSquares);
    }
}