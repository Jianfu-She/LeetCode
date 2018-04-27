package com.sjf.alg;

/**
 * 归并排序
 * @author SJF
 */
public class MergeSort {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        partition(arr, 0, arr.length - 1);

        return arr;
    }

    private static void partition(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        // (right + left) / 2 可能会溢出
        int mid = (right - left) / 2 + left;
        partition(arr, left, mid);
        partition(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int l = left;
        int r = mid + 1;
        int index = 0;
        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                tmp[index++] = arr[l++];
            } else {
                tmp[index++] = arr[r++];
            }
        }
        while (l <= mid) {
            tmp[index++] = arr[l++];
        }
        while (r <= right) {
            tmp[index++] = arr[r++];
        }
        /*for (int i = 0; i < tmp.length; i++) {
            arr[left + i] = tmp[i];
        }*/
        System.arraycopy(tmp, 0, arr, left, tmp.length);
    }

    public static void main(String[] args) {

        int[] testArr1 = SortTestHelper.generateRandomArray(10, 1, 99);
        SortTestHelper.printArray(testArr1);
        SortTestHelper.printArray(sort(testArr1));

        // 21ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.MergeSort", testArr2);

        // 9ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.MergeSort", testArr3);
    }
}
