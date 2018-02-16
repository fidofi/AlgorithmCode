package SortMethod.impl;

import SortMethod.ISort;
import SortMethod.SortUtil;

/**
 * Created by fido on 2018/2/15.
 * 堆排序
 * 注意二叉堆这种数据结构属于完全二叉树
 */
public class HeapSort implements ISort {
    @Override
    public int[] sort(int[] previous) {
        //1.构建大顶堆
        //从下往上的第一个非叶子结点开始
        for (int i = (previous.length - 1) / 2; i >= 0; i--) {
            buildMaxHeap(previous, i, previous.length);
        }
        //2.取出最大，并调整堆结构
        for (int i = previous.length - 1; i >= 0; i--) {
            SortUtil.swap(0, i, previous);
            buildMaxHeap(previous, 0, i);
        }
        return previous;
    }

    /**
     * 构建大顶堆
     *
     * @param arr
     * @param i      父节点的下标
     * @param length 并不是指数组的长度，而是指到哪里停止的下标
     */
    private void buildMaxHeap(int[] arr, int i, int length) {
        int temp = arr[i];//先取出当前元素i
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {//从i结点的左子结点开始，也就是2i+1处开始
            if (k + 1 < length && arr[k] < arr[k + 1]) {//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if (arr[k] > temp) {//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }
}
