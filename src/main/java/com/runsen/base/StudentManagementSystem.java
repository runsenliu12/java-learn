package com.runsen.base;

import java.util.ArrayList;
import java.util.Scanner;

class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name, int age) {
        Student student = new Student(id, name, age);
        students.add(student);
        System.out.println("学生已添加：" + student.toString());
    }

    public void findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("找到学生信息：" + student.toString());
                return;
            }
        }
        System.out.println("未找到ID为 " + id + " 的学生信息。");
    }

    public void updateStudent(int id, String newName, int newAge) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("学生信息已更新：" + student.toString());
                return;
            }
        }
        System.out.println("未找到ID为 " + id + " 的学生信息，无法更新。");
    }

    public void displayAllStudents() {
        System.out.println("所有学生信息：");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("\n学生管理系统");
            System.out.println("1. 添加学生");
            System.out.println("2. 查找学生");
            System.out.println("3. 更新学生信息");
            System.out.println("4. 显示所有学生");
            System.out.println("5. 退出");
            System.out.print("请选择操作：");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("请输入学生ID: ");
                    int id = scanner.nextInt();
                    System.out.print("请输入学生姓名: ");
                    String name = scanner.next();
                    System.out.print("请输入学生年龄: ");
                    int age = scanner.nextInt();
                    system.addStudent(id, name, age);
                    break;
                case 2:
                    System.out.print("请输入要查找的学生ID: ");
                    int searchId = scanner.nextInt();
                    system.findStudent(searchId);
                    break;
                case 3:
                    System.out.print("请输入要更新的学生ID: ");
                    int updateId = scanner.nextInt();
                    System.out.print("请输入新的学生姓名: ");
                    String newName = scanner.next();
                    System.out.print("请输入新的学生年龄: ");
                    int newAge = scanner.nextInt();
                    system.updateStudent(updateId, newName, newAge);
                    break;
                case 4:
                    system.displayAllStudents();
                    break;
                case 5:
                    System.out.println("感谢使用学生管理系统！");
                    System.exit(0);
                default:
                    System.out.println("无效的选项，请重新选择。");
            }
        }
    }
}