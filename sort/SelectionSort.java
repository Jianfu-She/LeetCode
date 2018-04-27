package com.sjf.alg;


/**
 * 选择排序
 * @author SJF
 */
public class SelectionSort {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
        return arr;
    }

    private static void swap(int[] arr, int index1, int index2) {
        // 采用该种方法作替换时一定要比较两个下标是否相同
        if (index1 != index2) {
            arr[index1] = arr[index1] + arr[index2];
            arr[index2] = arr[index1] - arr[index2];
            arr[index1] = arr[index1] - arr[index2];
        }
        /*int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;*/
    }

    public static void main(String[] args) {

        int[] testArr1 = SortTestHelper.generateRandomArray(10, 1, 99);
        SortTestHelper.printArray(testArr1);
        SortTestHelper.printArray(sort(testArr1));

        // 4723ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.SelectionSort", testArr2);

        // 4888ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.SelectionSort", testArr3);
    }
}
