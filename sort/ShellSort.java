package com.sjf.alg;

/**
 * 希尔排序
 * @author SJF
 */
public class ShellSort {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                int a = arr[i];
                int j = i;
                for (; j >= h && a < arr[j - h]; j--) {
                    arr[j] = arr[j - h];
                }
                arr[j] = a;
            }
            h /= 3;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] testArr1 = SortTestHelper.generateRandomArray(10, 1, 99);
        SortTestHelper.printArray(testArr1);
        SortTestHelper.printArray(sort(testArr1));

        // 1508ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.ShellSort", testArr2);

        // 1079ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.ShellSort", testArr3);
    }
}
