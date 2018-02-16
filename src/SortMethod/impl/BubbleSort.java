package SortMethod.impl;

import SortMethod.ISort;
import SortMethod.SortUtil;

/**
 * Created by fido on 2018/2/13.
 * 冒泡排序
 * 相邻的数据进行两两比较，小数放在前面，大数放在后面，这样一趟下来，
 * 最小的数就被排在了第一位，第二趟也是如此，如此类推，直到所有的数据排序完成
 */
public class BubbleSort implements ISort {

    @Override
//    public int[] sort(int[] previous) {
//        for (int i = 0; i < previous.length; i++) { //记录已经比较了的次数
//            for (int j = 0; j < previous.length - i - 1; j++) { //记录比较到哪个位就不用比较了，因为后面的已经比较过了
//                if (previous[j] > previous[j + 1]) {
//                    SortUtil.swap(j, j + 1, previous);
//                }
//            }
//        }
//        return previous;
//    }

    /**
     * 冒泡排序的改进版
     * 上面的代码如果在数组已经排好序的情况下，如果比较趟数没有到达arr.length次，也会继续进行比较
     * 可设置一个标志位，如果该次没有发生数组交换的情况，则说明数组已经排好序了，就停止遍历
     */
    public int[] sort(int[] previous) {
        boolean flag = false;
        for (int i = 0; i < previous.length; i++) {
            for (int j = 0; j < previous.length - i - 1; j++) {
                if (previous[j] > previous[j + 1]) {
                    int temp = previous[j];
                    previous[j] = previous[j + 1];
                    previous[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return previous;
            }
        }
        return previous;
    }

}
