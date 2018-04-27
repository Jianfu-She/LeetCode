package com.sjf.alg;

/**
 * 堆排序
 * @author SJF
 */
public class HeapSort {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        // 构建大根堆，从最后一个非空父节点入手
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            maxHeapAdjust(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            maxHeapAdjust(arr, 0, i);
        }

        return arr;
    }

    private static void maxHeapAdjust(int[] arr, int index, int length) {
        while (2 * index + 1 < length) {
            // 用数组来表示堆，i结点的父结点下标就为(i – 1) / 2
            // 它的左右子结点下标分别为2 * i + 1和2 * i + 2
            int child = 2 * index + 1;
            if (child < length - 1 && arr[child] < arr[child + 1]) {
                child++;
            }
            if (arr[index] > arr[child]) {
                break;
            }
            swap(arr, child, index);
            index = child;
        }
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

        // 13ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.HeapSort", testArr2);

        // 6ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.HeapSort", testArr3);
    }
}
