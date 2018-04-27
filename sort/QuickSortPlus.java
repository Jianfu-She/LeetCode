package com.sjf.alg;

/**
 * 三路快排
 * @author SJF
 */
public class QuickSortPlus {

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        process(arr, 0, arr.length - 1);

        return arr;
    }

    private static void process(int[] arr, int left, int right) {
        if (right - left < 16) {
            InsertionSortPlus.sort(arr, left, right);
            return;
        }

        int randomIndex = (int) (left + Math.random() * (right - left + 1));
        swap(arr, right, randomIndex);
        int[] pivot = partition(arr, left, right);
        process(arr, left, pivot[0] - 1);
        process(arr, pivot[1] + 1, right);
    }

    private static int[] partition(int[] arr, int left, int right) {
        int l = left;
        int r = right - 1;
        int i = left;

        while (l <= r) {
            if (arr[l] < arr[right]) {
                swap(arr, i++, l++);
            } else if (arr[l] > arr[right]) {
                swap(arr, l, r--);
            } else {
                l++;
            }
        }
        swap(arr, right, l);

        int[] pivot = new int[2];
        pivot[0] = i;
        pivot[1] = l;

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

        // 16ms
        int[] testArr2 = SortTestHelper.generateRandomArray(100000, 1, 999999);
        SortTestHelper.testSort("com.sjf.alg.QuickSortPlus", testArr2);

        // 8ms
        int[] testArr3 = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        SortTestHelper.testSort("com.sjf.alg.QuickSortPlus", testArr3);
    }
}
