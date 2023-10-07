package com.runsen.work;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor // 添加此注解以确保生成全参数构造函数
public class MyObject {
    private String brand;
    private String category;
    private int score;
    private double distance;
}
