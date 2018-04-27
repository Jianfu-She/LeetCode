package com.sjf.alg;

import java.lang.reflect.Method;

/**
 * 排序辅助类
 * @author SJF
 */
public class SortTestHelper {

    /**
     * 生成有n个元素的随机数组,每个元素的随机范围为[rangeL, rangeR]
     */
    public static int[] generateRandomArray(int n, int rangeL, int rangeR) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (rangeR - rangeL + 1) + rangeL);
        }
        return arr;
    }

    /**
     * 生成一个近乎有序的数组
     */
    public static int[] generateAlmostOrderedArray(int n, int swapTimes) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < swapTimes; i++) {
            int index1 = (int) (Math.random() * n);
            int index2 = (int) (Math.random() * n);
            int tmp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = tmp;
        }
        return arr;
    }

    /**
     * 打印数组的所有内容
     */
    public static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    /**
     * 判断数组是否有序
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印排序算法的准确性与耗费时间
     */
    public static void testSort(String sortClassName, int[] arr) {
        try {
            Class<?> sortClass = Class.forName(sortClassName);
            Method method = sortClass.getMethod("sort", int[].class);
            Object[] params = new Object[]{arr};

            long startTime = System.currentTimeMillis();
            method.invoke(null, params);
            long endTime = System.currentTimeMillis();

            if (isSorted(arr)) {
                System.out.println(sortClass.getSimpleName() + " : " + (endTime - startTime) + "ms");
            } else {
                System.out.println("Sort ERROR!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
