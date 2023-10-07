
`ArrayList` 类的一些常见操作API，以及每个操作的简要说明。此外，我还为每个操作提供了一个练习题和答案，以帮助你更好地理解这些操作。

### 1. 添加元素

#### API：`add(E element)`

**说明：** 向列表的末尾添加一个元素。

**练习题：** 创建一个空的 `ArrayList`，然后添加几个整数元素，最后打印列表的内容。

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
    }
}
```

**答案：**
```
[10, 20, 30]
```

### 2. 获取元素

#### API：`get(int index)`

**说明：** 获取指定位置的元素。

**练习题：** 创建一个包含一些字符串的 `ArrayList`，然后获取其中一个元素并打印它。

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String fruit = fruits.get(1);
        System.out.println(fruit);
    }
}
```

**答案：**
```
Banana
```

### 3. 修改元素

#### API：`set(int index, E element)`

**说明：** 替换指定位置的元素。

**练习题：** 创建一个包含整数的 `ArrayList`，然后将其中一个元素替换为新值，然后打印整个列表。

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.set(1, 25);

        System.out.println(numbers);
    }
}
```

**答案：**
```
[10, 25, 30]
```

### 4. 删除元素

#### API：`remove(int index)`

**说明：** 删除指定位置的元素。

**练习题：** 创建一个包含一些颜色的 `ArrayList`，然后删除其中一个元素，然后打印整个列表。

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.remove(1);

        System.out.println(colors);
    }
}
```

**答案：**
```
[Red, Blue]
```

### 5. 获取列表大小

#### API：`size()`

**说明：** 返回列表中元素的数量。

**练习题：** 创建一个包含一些数字的 `ArrayList`，然后获取列表的大小并打印它。

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int size = numbers.size();
        System.out.println("Size of the list: " + size);
    }
}
```

**答案：**
```
Size of the list: 3
```

这些是 `ArrayList` 类的一些常见操作。你可以使用这些操作来管理和操作动态数组的元素。通过编写练习题和尝试不同的操作，你可以更好地理解和熟悉 `ArrayList` 的使用。
