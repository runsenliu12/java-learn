package com.runsen.base;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayListExample {
    public static void main(String[] args) {
        // 使用 Array
        int[] intArray = new int[5];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        // 使用 ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // 访问元素
        int elementFromArray = intArray[2]; // 访问 Array 中的元素
        int elementFromArrayList = arrayList.get(2); // 访问 ArrayList 中的元素

        System.out.println("Element from Array: " + elementFromArray);
        System.out.println("Element from ArrayList: " + elementFromArrayList);

        // 打印 Array 和 ArrayList
        System.out.println("Array: " + Arrays.toString(intArray));
        System.out.println("ArrayList: " + arrayList);

        // 修改元素
        intArray[2] = 33; // 修改 Array 中的元素
        arrayList.set(2, 33); // 修改 ArrayList 中的元素

        // 打印修改后的 Array 和 ArrayList
        System.out.println("Modified Array: " + Arrays.toString(intArray));
        System.out.println("Modified ArrayList: " + arrayList);

    }
}
