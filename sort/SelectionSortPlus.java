package com.sjf.alg;

/**
 * 选择排序加强版
 * 一次遍历同时选出最大值与最小值
 * @author SJF
 */
public class SelectionSortPlus {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int minIndex = left;
            int maxIndex = right;
            if (arr[maxIndex] < arr[minIndex]) {
                swap(arr, minIndex, maxIndex);
            }
            for (int i = left + 1; i < right; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(arr, left++, minIndex);
            swap(arr, right--, maxIndex);
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

        // 2818ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.SelectionSortPlus", testArr2);

        // 2638ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.SelectionSortPlus", testArr3);
    }
}
