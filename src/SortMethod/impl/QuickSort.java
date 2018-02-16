package SortMethod.impl;

import SortMethod.ISort;
import SortMethod.SortUtil;

/**
 * Created by fido on 2018/2/15.
 * 快速排序
 * 选基准，左边都比基准小，右边都比基准大
 */
public class QuickSort implements ISort {

    @Override
    public int[] sort(int[] previous) {
        quickSort(previous, 0, previous.length - 1);
        return previous;
    }

    private int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);

        }
        return arr;
    }

    /**
     * 选取数组的第一个元素为基准，使基准左边的数都比基准小，基准右边的数都比基准大，并返回基准的位置
     *
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public int partition(int[] arr, int start, int end) {
        int temp = arr[start];//先把基准的值记录下来
        while (start < end) {
            while (start < end && arr[end] >= temp) {
                --end;
            }
            arr[start] = arr[end];
            while (start < end && arr[start] <= temp) {
                ++start;
            }
            arr[end] = arr[start];
        }
        arr[start] = temp;
        return start;
    }

}
