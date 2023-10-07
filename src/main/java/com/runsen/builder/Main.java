package com.runsen.builder;

public class Main {
    public static void main(String[] args) {
        // 使用 Builder 模式创建 Person 对象
        Person person = new Person.PersonBuilder()
            .firstName("John")
            .lastName("Doe")
            .age(30)
            .address("123 Main St")
            .build();

        // 打印 Person 对象的属性
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}