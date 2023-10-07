package com.runsen.work;

import com.runsen.work.MyObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BrandSorting {
    public static void main(String[] args) {
        List<MyObject> brandList = new ArrayList<>();

        // 添加示例数据
        brandList.add(MyObject.builder().brand("A").category("1").score(90).distance(200).build());
        brandList.add(MyObject.builder().brand("A").category("2").score(80).distance(400).build());
        brandList.add(MyObject.builder().brand("A").category("3").score(80).distance(2000).build());
        brandList.add(MyObject.builder().brand("B").category("1").score(90).distance(300).build());
        brandList.add(MyObject.builder().brand("B").category("2").score(90).distance(500).build());
        brandList.add(MyObject.builder().brand("B").category("2").score(90).distance(3000).build());
        brandList.add(MyObject.builder().brand("C").category("1").score(50).distance(1500).build());
        brandList.add(MyObject.builder().brand("C").category("2").score(70).distance(2500).build());
        brandList.add(MyObject.builder().brand("D").category("1").score(95).distance(700).build());
        brandList.add(MyObject.builder().brand("D").category("2").score(85).distance(900).build());

        // 自定义排序比较器，按照分数排序
        Comparator<MyObject> scoreComparator = Comparator.comparingInt(MyObject::getScore);

        // 自定义排序比较器，按照距离排序
        Comparator<MyObject> distanceComparator = Comparator.comparingDouble(MyObject::getDistance);

        // 分组：1千米内和1千米外的品牌
        List<MyObject> within1Km = new ArrayList<>();
        List<MyObject> beyond1Km = new ArrayList<>();

        for (MyObject brand : brandList) {
            if (brand.getDistance() <= 1000) {
                within1Km.add(brand);
            } else {
                beyond1Km.add(brand);
            }
        }

        // 对1千米内的品牌按照分数排序，并选择每个品牌中分数最高的一个
        List<MyObject> within1KmSorted = new ArrayList<>();
        for (String uniqueBrand : getUniqueBrands(within1Km)) {
            List<MyObject> sameBrandWithin1Km = filterByBrand(within1Km, uniqueBrand);
            Collections.sort(sameBrandWithin1Km, scoreComparator);
            within1KmSorted.add(sameBrandWithin1Km.get(sameBrandWithin1Km.size() - 1));
        }

        // 对1千米内的品牌按照距离排序
        Collections.sort(within1KmSorted, distanceComparator);

        // 对1千米外的品牌按照距离排序
        Collections.sort(beyond1Km, distanceComparator);

        // 合并排序后的列表
        List<MyObject> sortedBrands = new ArrayList<>();
        sortedBrands.addAll(within1KmSorted);
        sortedBrands.addAll(beyond1Km);

        // 输出排序结果
        for (MyObject brand : sortedBrands) {
            System.out.println("品牌: " + brand.getBrand() + ", 类别: " + brand.getCategory() + ", 分数: " + brand.getScore() + ", 距离: " + brand.getDistance());
        }
    }

    // 获取唯一的品牌名称
    private static List<String> getUniqueBrands(List<MyObject> brandList) {
        List<String> uniqueBrands = new ArrayList<>();
        for (MyObject brand : brandList) {
            if (!uniqueBrands.contains(brand.getBrand())) {
                uniqueBrands.add(brand.getBrand());
            }
        }
        return uniqueBrands;
    }

    // 根据品牌过滤列表
    // 根据品牌过滤列表
    private static List<MyObject> filterByBrand(List<MyObject> brandList, String brandName) {
        List<MyObject> filteredList = new ArrayList<>();
        for (MyObject brand : brandList) {
            if (brand.getBrand().equals(brandName)) {
                filteredList.add(brand);
            }
        }
        return filteredList;
    }
}
