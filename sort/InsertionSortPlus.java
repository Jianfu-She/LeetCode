package com.sjf.alg;

/**
 * 插入排序加强版
 * swap()也会耗费时间，而赋值比交换要快
 * @author SJF
 */
public class InsertionSortPlus {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1] > a; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = a;
        }

        return arr;
    }

    public static void sort(int[] arr, int left, int right) {
        for (int i = left; i <= right; i++) {
            int a = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1] > a; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = a;
        }
    }

    public static void main(String[] args) {

        int[] testArr1 = SortTestHelper.generateRandomArray(10, 1, 99);
        SortTestHelper.printArray(testArr1);
        SortTestHelper.printArray(sort(testArr1));

        // 852ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.InsertionSortPlus", testArr2);

        // 31ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.InsertionSortPlus", testArr3);
    }
}
