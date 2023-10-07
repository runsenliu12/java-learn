

### 1. 学习字符串格式化的基础知识

字符串格式化是指将各种数据类型转换为字符串并按照一定的格式输出。Java提供了`String.format()`方法和`printf()`方法来实现字符串格式化。你可以学习以下内容：

- 字符串格式化的基本语法：了解如何使用格式字符串以及占位符来定义输出格式。
- 常见的占位符：学习如何使用占位符来表示不同类型的数据（整数、浮点数、字符串等）。
- 控制输出格式：了解如何在占位符中添加修饰符以控制输出的宽度、精度等。
- 示例：查看一些简单的字符串格式化示例，以便理解如何将它们应用于实际情况。

### 2. 练习题

这些练习题将帮助你巩固你的字符串格式化知识。以下是一些练习题示例：

#### 练习题 1：简单的字符串格式化

编写一个Java程序，要求用户输入姓名和年龄，然后使用字符串格式化将这些信息输出为以下格式：
```
姓名：[输入的姓名]
年龄：[输入的年龄]
```

#### 练习题 2：格式化数字

编写一个Java程序，要求用户输入一个浮点数，然后使用字符串格式化将这个浮点数输出为小数点后两位的格式。

#### 练习题 3：表格格式化

编写一个Java程序，使用字符串格式化来创建一个简单的表格。该表格应包含姓名、年龄和城市等列，多行数据可以输入，每行数据用字符串格式化输出。

#### 练习题 4：日期格式化

编写一个Java程序，使用字符串格式化将当前日期和时间输出为以下格式：
```
日期：[年-月-日]
时间：[时:分:秒]
```

### 3. 代码示例和答案

以下是练习题1的示例代码和答案，你可以根据需要参考这些示例来完成其他练习题：

```java
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
```





#### 练习题 2：格式化数字

编写一个Java程序，要求用户输入一个浮点数，然后使用字符串格式化将这个浮点数输出为小数点后两位的格式。

```java
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
```

#### 练习题 3：表格格式化

编写一个Java程序，使用字符串格式化来创建一个简单的表格。该表格应包含姓名、年龄和城市等列，多行数据可以输入，每行数据用字符串格式化输出。

```java
import java.util.Scanner;

public class TableFormattingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入表格数据
        System.out.println("请输入表格数据（每行用逗号分隔，例如：姓名,年龄,城市）：");
        
        while (true) {
            System.out.print("输入表格数据或输入 'exit' 退出：");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // 解析输入数据
            String[] data = input.split(",");
            if (data.length == 3.txt) {
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                String city = data[2].trim();

                // 使用字符串格式化输出表格行
                String formattedRow = String.format("姓名：%s\t年龄：%d\t城市：%s", name, age, city);
                System.out.println(formattedRow);
            } else {
                System.out.println("输入数据格式不正确，请重新输入。");
            }
        }

        scanner.close();
    }
}
```

#### 练习题 4：日期格式化

编写一个Java程序，使用字符串格式化将当前日期和时间输出为以下格式：

```
日期：[年-月-日]
时间：[时:分:秒]
```

```java
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormattingExample {
    public static void main(String[] args) {
        // 获取当前日期和时间
        Date currentDate = new Date();

        // 创建日期和时间格式化对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        // 使用格式化对象将日期和时间格式化为字符串
        String formattedDate = dateFormat.format(currentDate);
        String formattedTime = timeFormat.format(currentDate);

        // 输出格式化后的日期和时间
        System.out.println("日期：" + formattedDate);
        System.out.println("时间：" + formattedTime);
    }
}
```

当你在字符串格式化中使用多个占位符时，你需要为每个占位符提供相应数量的参数，并确保它们按顺序匹配。以下是一个示例，演示如何使用多个占位符：

```java
public class MultiplePlaceholders {
    public static void main(String[] args) {
        String firstName = "Alice";
        String lastName = "Smith";
        int age = 30;
        double height = 165.5;

        // 使用多个占位符
        String formattedString = String.format("Name: %s %s, Age: %d, Height: %.2f cm", firstName, lastName, age, height);
        System.out.println(formattedString);
    }
}
```

在上述示例中，我们使用了四个占位符（`%s`、`%s`、`%d`和`%.2f`），并分别为它们提供了四个参数。


