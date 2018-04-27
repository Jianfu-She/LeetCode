package com.sjf.alg;

import java.util.Arrays;

/**
 * 比较算法性能
 * @author SJF
 */
public class Main {

    public static void main(String[] args) {

        // 1. 完全无序的对象
        System.out.println("完全无序的对象排序");
        int[] sourceRadomArr = SortTestHelper.generateRandomArray(100000, 1, 999999);
        int[] randomArr1 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr2 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr3 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr4 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr5 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr6 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr7 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr8 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr9 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr10 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr11 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        int[] randomArr12 = Arrays.copyOf(sourceRadomArr, sourceRadomArr.length);
        SortTestHelper.testSort("com.sjf.alg.BubbleSort", randomArr1);
        SortTestHelper.testSort("com.sjf.alg.SelectionSort", randomArr2);
        SortTestHelper.testSort("com.sjf.alg.SelectionSortPlus", randomArr3);
        SortTestHelper.testSort("com.sjf.alg.InsertionSort", randomArr4);
        SortTestHelper.testSort("com.sjf.alg.InsertionSortPlus", randomArr5);
        SortTestHelper.testSort("com.sjf.alg.MergeSort", randomArr6);
        SortTestHelper.testSort("com.sjf.alg.MergeSortPlus", randomArr7);
        SortTestHelper.testSort("com.sjf.alg.QuickSort", randomArr8);
        SortTestHelper.testSort("com.sjf.alg.QuickSortPlus", randomArr9);
        SortTestHelper.testSort("com.sjf.alg.HeapSort", randomArr10);
        SortTestHelper.testSort("com.sjf.alg.ShellSort", randomArr11);
        SortTestHelper.testSort("com.sjf.alg.CountSort", randomArr12);

        System.out.println();

        // 2. 几乎有序的对象
        System.out.println("几乎有序的对象排序");
        int[] sourceOrderedArr = SortTestHelper.generateAlmostOrderedArray(100000, 1000);
        int[] orderedArr1 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr2 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr3 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr4 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr5 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr6 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr7 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr8 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr9 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr10 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr11 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        int[] orderedArr12 = Arrays.copyOf(sourceOrderedArr, sourceOrderedArr.length);
        SortTestHelper.testSort("com.sjf.alg.BubbleSort", orderedArr1);
        SortTestHelper.testSort("com.sjf.alg.SelectionSort", orderedArr2);
        SortTestHelper.testSort("com.sjf.alg.SelectionSortPlus", orderedArr3);
        SortTestHelper.testSort("com.sjf.alg.InsertionSort", orderedArr4);
        SortTestHelper.testSort("com.sjf.alg.InsertionSortPlus", orderedArr5);
        SortTestHelper.testSort("com.sjf.alg.MergeSort", orderedArr6);
        SortTestHelper.testSort("com.sjf.alg.MergeSortPlus", orderedArr7);
        SortTestHelper.testSort("com.sjf.alg.QuickSort", orderedArr8);
        SortTestHelper.testSort("com.sjf.alg.QuickSortPlus", orderedArr9);
        SortTestHelper.testSort("com.sjf.alg.HeapSort", orderedArr10);
        SortTestHelper.testSort("com.sjf.alg.ShellSort", orderedArr11);
        SortTestHelper.testSort("com.sjf.alg.CountSort", orderedArr12);
    }

}
