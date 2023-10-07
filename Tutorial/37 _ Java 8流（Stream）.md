
Java 8引入的流（Stream）是一个非常强大的API，它允许你以一种更容易、更声明性的方式对数据集合进行操作。流可以用于集合、数组、I/O操作，甚至可以用于生成无限序列的元素。

# Java 8流（Stream）教程

## 1. 什么是流？

流是一种用于处理数据的抽象概念，它允许你以一种声明性的方式对数据进行操作。流可以执行一系列的操作来过滤、转换、组合和汇总数据，而不需要显式的循环。流通常用于集合（例如List、Set、Map等）、数组或I/O操作。

## 2. 创建流

在Java 8中，你可以从集合或数组创建流。以下是一些常见的创建流的方式：

### 从集合创建流

```java
List<String> myList = Arrays.asList("apple", "banana", "cherry");
Stream<String> stream = myList.stream();
```

### 从数组创建流

```java
int[] myArray = {1, 2, 3, 4, 5};
IntStream stream = Arrays.stream(myArray);
```

## 3. 常见的流操作

流提供了各种各样的操作，包括中间操作和终端操作。中间操作用于对流进行转换和过滤，终端操作用于触发流的计算并返回结果。

以下是一些常见的流操作：

### 过滤元素

```java
Stream<String> filteredStream = myList.stream().filter(s -> s.startsWith("a"));
```

### 映射元素

```java
Stream<Integer> mappedStream = myList.stream().map(s -> s.length());
```

### 排序元素

```java
Stream<String> sortedStream = myList.stream().sorted();
```

### 汇总元素

```java
int sum = myArrayStream.sum();
```

## 练习题

1. 创建一个整数列表，然后使用流计算列表中的所有偶数的平均值。
2. 创建一个字符串列表，然后使用流过滤出长度大于等于5的字符串，并将它们连接成一个新的字符串，用逗号分隔。
3. 创建一个整数列表，使用流操作找到列表中的最大值。
4. 创建一个包含不同数字的数组，使用流操作计算数组中所有偶数的平方和。


## 答案

### 练习题1 答案

```java
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
```

### 练习题2 答案

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        String result = strings.stream()
                .filter(s -> s.length() >= 5) // 过滤长度大于等于5的字符串
                .collect(Collectors.joining(", ")); // 连接成一个新的字符串，用逗号分隔

        System.out.println("结果：" + result);
    }
}
```



### 练习题3 答案

```java
List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);

// 使用流操作找到列表中的最大值
Optional<Integer> max = numbers.stream().max(Integer::compare);
if (max.isPresent()) {
    System.out.println("最大值: " + max.get());
} else {
    System.out.println("列表为空");
}
```

### 练习题4 答案



```java
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

// 使用流操作计算数组中所有偶数的平方和
int sumOfEvenSquares = Arrays.stream(numbers)
                             .filter(n -> n % 2 == 0)
                             .map(n -> n * n)
                             .sum();

System.out.println("偶数的平方和: " + sumOfEvenSquares);
```


