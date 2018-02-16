package SortMethod;

import SortMethod.impl.*;
import org.junit.Test;

/**
 * Created by fido on 2018/2/13.
 */

public class SortTest {
    private int[] arr = {4, 7, 2, 8, 1, 10, 3, 44, 25, 24, 55, 87, 15};

    //冒泡
    @Test
    public void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        SortUtil.show(arr, "冒泡排序");
    }

    //选择
    @Test
    public void testSelectSort() {
        SelectSort selectSort = new SelectSort();
        selectSort.sort(arr);
        SortUtil.show(arr, "选择排序");
    }

    //直接插入排序
    @Test
    public void testInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        SortUtil.show(arr, "直接插入排序");
    }

    //希尔排序
    @Test
    public void testShellSort() {
        ShellSort shellSort = new ShellSort();
        shellSort.sort(arr);
        SortUtil.show(arr, "希尔排序");
    }

    //快速排序
    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);
        SortUtil.show(arr, "快速排序");
    }

    //归并排序
    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        SortUtil.show(arr, "归并排序");
    }

    //堆排序
    @Test
    public void testHeapSort() {
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        SortUtil.show(arr, "堆排序");
    }

    //基数排序
    @Test
    public void testRadixSort() {
        RadixSort radixSort = new RadixSort();
        radixSort.sort(arr);
        SortUtil.show(arr, "基数排序");
    }
}
