package com.runsen.work;

public class Main {
    public static void main(String[] args) {
        MyObject myObject = MyObject.builder()
                .brand("某个品牌")
                .score(80)
                .distance(10.5)
                .build();

        String brand = myObject.getBrand();
        int score = myObject.getScore();
        double distance = myObject.getDistance();

        System.out.println("品牌: " + brand);
        System.out.println("分数: " + score);
        System.out.println("距离: " + distance);
    }
}
