package com.sjf.alg;

/**
 * 快速排序
 * @author SJF
 */
public class QuickSort {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        process(arr, 0, arr.length - 1);

        return arr;
    }

    private static void process(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int randomIndex = (int) (Math.random() * (right - left + 1) + left);
        swap(arr, right, randomIndex);
        int pivot = partition(arr, left, right);
        process(arr, left, pivot - 1);
        process(arr, pivot + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = left - 1;
        for (int i = left; i <= right; i++) {
            if (arr[i] <= arr[right]) {
                swap(arr, ++pivot, i);
            }
        }
        return pivot;
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

        // 12ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.QuickSort", testArr2);

        // 6ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.QuickSort", testArr3);
    }
}
