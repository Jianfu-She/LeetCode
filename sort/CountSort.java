package com.sjf.alg;

/**
 * 计数排序
 * @author SJF
 */
public class CountSort {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int min = arr[0];
        int max = arr[0];
        for (int a : arr) {
            min = Math.min(a, min);
            max = Math.max(a, max);
        }

        int[] countArr = new int[max - min + 1];
        for (int a : arr) {
            countArr[a - min]++;
        }

        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i]-- > 0) {
                arr[index++] = min + i;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] testArr1 = SortTestHelper.generateRandomArray(10, 1, 99);
        SortTestHelper.printArray(testArr1);
        SortTestHelper.printArray(sort(testArr1));

        // 10ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.CountSort", testArr2);

        // 6ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.CountSort", testArr3);
    }
}
