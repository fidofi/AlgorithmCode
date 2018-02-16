package SortMethod.impl;

import SortMethod.ISort;

/**
 * Created by fido on 2018/2/15.
 * 归并排序
 * 先递归的分解数列，再合并数列就完成了归并排序。
 */
public class MergeSort implements ISort {

    @Override
    public int[] sort(int[] previous) {
        sort(previous, 0, previous.length);
        return previous;
    }

    private void sort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        mergeArray(arr, start, mid, end);
    }

    /**
     * 合并数组
     *
     * @param arr
     * @param first
     * @param middle
     * @param end
     */
    public void mergeArray(int[] arr, int first, int middle, int end) {
        int[] temp = new int[arr.length];
        int r = middle + 1;
        int left = first;
        int right = end;
        int k = 0;//用来记录排序时开辟的新数组的下标
        while (left <= middle && r <= right) {
            if (arr[left] <= arr[r]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[r++];
            }
        }
        while (left <= middle) {
            temp[k++] = arr[left++];
        }
        while (r <= right) {
            temp[k++] = arr[r++];
        }
        //将排序好的数组拷贝到原数组
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }
}
