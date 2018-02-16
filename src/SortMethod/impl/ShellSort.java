package SortMethod.impl;

import SortMethod.ISort;
import SortMethod.SortUtil;

/**
 * Created by fido on 2018/2/15.
 * 希尔排序
 * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止
 */
public class ShellSort implements ISort {

    @Override
    public int[] sort(int[] previous) {
        int incre = previous.length;
        while (true) {
            incre = incre / 2;//初始增量为数组长度/2
            for (int i = 0; i < incre; i++) {//分的组数
                for (int k = i + incre; k < previous.length; k = k + incre) {
                    System.out.println("k为："+k);
                    for (int j = k; j > i; j=j-incre) {
                        System.out.println("j为:"+j);
                        if (previous[j - incre] > previous[j])
                            SortUtil.swap(j - incre, j, previous);
                        else
                            break;
                    }
                }
            }
            if (incre == 1) {
                break;
            }
        }
        return previous;
    }
}
