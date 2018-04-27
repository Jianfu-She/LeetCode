package com.sjf.alg;

/**
 * 插入排序
 * @author SJF
 */
public class InsertionSort {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static void main(String[] args) {

        int[] testArr1 = SortTestHelper.generateRandomArray(10, 1, 99);
        SortTestHelper.printArray(testArr1);
        SortTestHelper.printArray(sort(testArr1));

        // 1497ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.InsertionSort", testArr2);

        // 41ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.InsertionSort", testArr3);
    }
}
