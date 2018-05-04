# 排序算法-基础 

1. [冒泡排序](https://github.com/Jianfu-She/LeetCode/blob/master/sort/BubbleSort.java) <br/>
  该排序算法与数组原始序列无关。<br/>
  时间复杂度：O(N*N) <br/>
  空间复杂度：O(1) <br/>
  稳定性：稳定 <br/>
  ![图示](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/BubbleSort.gif) <br/>
2. [选择排序](https://github.com/Jianfu-She/LeetCode/tree/master/sort/SelectionSort.java) <br/>
  该排序算法与数组原始序列无关。<br/>
  时间复杂度：O(N*N) <br/>
  空间复杂度：O(1) <br/>
  稳定性：不稳定 <br/>
  ![图示](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/SelectionSort.gif) <br/>
3. [插入排序](https://github.com/Jianfu-She/LeetCode/tree/master/sort/InsertionSort.java) <br/>
  该排序算法与数组原始序列有关，若每个元素移动距离不超过K，可控制时间复杂度不超过O(N·K)。<br/>
  时间复杂度：O(N*N) <br/>
  空间复杂度：O(1) <br/>
  稳定性：稳定 <br/>
  ![图示](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/InsertionSort.gif) <br/>
4. [归并排序](https://github.com/Jianfu-She/LeetCode/tree/master/sort/MergeSort.java) <br/>
  该排序算法与数组原始序列无关。<br/>
  时间复杂度：O(N*logN) <br/>
  空间复杂度：O(N) <br/>
  稳定性：稳定 <br/>
  ![图示](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/MergeSort.gif) <br/>
5. [快速排序](https://github.com/Jianfu-She/LeetCode/tree/master/sort/QuickSort.java) <br/>
  该排序算法与数组原始序列无关。<br/>
  时间复杂度：O(N*logN) <br/>
  空间复杂度：O(logN) ~ O(N) <br/>
  稳定性：不稳定 <br/>
  ![图示1](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/QuickSort1.gif) <br/>
  ![图示2](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/QuickSort2.gif) <br/>
6. [堆排序](https://github.com/Jianfu-She/LeetCode/tree/master/sort/HeapSort.java) <br/>
  该排序算法与数组原始序列有关，若每个元素移动距离不超过K，可控制时间复杂度不超过O(NlogK)。<br/>
  时间复杂度：O(NlogN) <br/>
  空间复杂度：O(1) （若是采取递归实现的堆排序，其空间复杂度为O(logN)）<br/>
  稳定性：不稳定 <br/>
  ![图示](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/HeapSort.gif) <br/>
7. [希尔排序](https://github.com/Jianfu-She/LeetCode/tree/master/sort/ShellSort.java) <br/>
  时间复杂度：O(N*logN) <br/>
  空间复杂度：O(1) <br/>
  稳定性：不稳定 <br/>
  ![图示](https://github.com/Jianfu-She/LeetCode/blob/master/sort/pic/ShellSort.gif) <br/>
8. [计数排序](https://github.com/Jianfu-She/LeetCode/tree/master/sort/CountSort.java) <br/>
  不是基于比较的排序算法，其思想来自于桶排序。 <br/>
  时间复杂度：O(N) <br/>
  空间复杂度：O(M) M表示选择桶的数量 <br/>
  稳定性：稳定 <br/>

*稳定性：*<br/>
*假定待排序的记录序列中，存在多个具有相同的关键字的记录，若经过排序，这些记录的相对次序保持不变，称这种排序算法是稳定的，否则称为不稳定的。* <br/>

- - -

# 排序算法-进阶

在排序之前，我们首先要考虑的不应该是采用哪种排序算法，我们首先要考虑的是待排序的对象。<br/>
- 完全无序的对象 <br/>
- 几乎有序的对象 <br/>
- 含有大量重复元素的对象 <br/>

针对不同的对象应该选择不同的排序方法，每种排序方法也有对应的改进版本。 <br/>

1. [选择排序加强版](https://github.com/Jianfu-She/LeetCode/tree/master/sort/SelectionSortPlus.java) <br/>
  如果一次遍历同时选出最大值与最小值，会不会快一点？ <br/>
2. [插入排序加强版](https://github.com/Jianfu-She/LeetCode/tree/master/sort/InsertionSortPlus.java) <br/>
  swap()也会耗费时间，据说赋值比交换要快？ <br/>
3. [归并排序加强版](https://github.com/Jianfu-She/LeetCode/tree/master/sort/MergeSortPlus.java) <br/>
  对于几乎有序的对象，插入排序的时间复杂度近似O(n)，所以？
4. [快排加强版](https://github.com/Jianfu-She/LeetCode/tree/master/sort/QuickSortPlus.java) <br/>
  三路快排了解一下？ <br/>

