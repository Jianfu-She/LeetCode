package com.sjf.alg;

/**
 * 归并排序加强版
 * @author SJF
 */
public class MergeSortPlus {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        partition(arr, 0, arr.length - 1);

        return arr;
    }

    private static void partition(int[] arr, int left, int right) {

        // 对于几乎有序的对象，插入排序近似O(n)
        if (right - left < 16) {
            InsertionSortPlus.sort(arr, left, right);
            return;
        }

        int mid = (right - left) / 2 + left;
        partition(arr, left, mid);
        partition(arr, mid + 1, right);

        // 对于近乎有序的对象非常有效,但是对于一般情况有一定的性能损失
        if (arr[mid] > arr[mid + 1]) {
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int l = left, r = mid + 1;
        int index = 0;
        while (l <= mid && r <= right) {
            if (arr[l] < arr[r]) {
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
        System.arraycopy(tmp, 0, arr, left, tmp.length);
    }

    public static void main(String[] args) {

        int[] testArr1 = SortTestHelper.generateRandomArray(10, 1, 99);
        SortTestHelper.printArray(testArr1);
        SortTestHelper.printArray(sort(testArr1));

        // 910ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.MergeSortPlus", testArr2);

        // 27ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.MergeSortPlus", testArr3);
    }
}
