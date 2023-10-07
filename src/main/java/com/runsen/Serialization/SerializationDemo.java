package com.runsen.Serialization;

import com.runsen.base.MyClass;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        // 创建一个对象
        MyClass objectToSerialize = new MyClass();

        try {
            // 创建一个对象输出流，用于将对象序列化为字节流
            FileOutputStream fileOutputStream = new FileOutputStream("serializedObject.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // 序列化对象
            objectOutputStream.writeObject(objectToSerialize);

            // 关闭流
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
