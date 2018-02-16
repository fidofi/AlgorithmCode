package SortMethod.impl;

import SortMethod.ISort;
import SortMethod.SortUtil;

/**
 * Created by fido on 2018/2/13.
 * 插入排序
 * 在要排序的一组数中，假定前n-1个数已经排好序，
 * 现在将第n个数插到前面的有序数列中，使得这n个数也是排好顺序的。如此反复循环，直到全部排好顺序。
 */
public class InsertionSort implements ISort {

    @Override
    public int[] sort(int[] previous) {
        for (int i = 0; i < previous.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (previous[j] < previous[j - 1]) {
                    SortUtil.swap(j - 1, j, previous);
                } else
                    break;
            }
        }
        return previous;
    }
}
