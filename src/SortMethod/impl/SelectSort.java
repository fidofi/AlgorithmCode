package SortMethod.impl;

import SortMethod.ISort;
import SortMethod.SortUtil;
import com.sun.org.glassfish.gmbal.IncludeSubclass;
import jdk.jfr.events.SocketReadEvent;

/**
 * Created by fido on 2018/2/13.
 * 选择排序
 * 在长度为N的无序数组中，第一次遍历n-1个数，找到最小的数值与第一个元素交换；
 * 第二次遍历n-2个数，找到最小的数值与第二个元素交换；
 */
public class SelectSort implements ISort {
    /**
     * 每次选出最小的放前面
     *
     * @param previous
     * @return
     */
    @Override
    public int[] sort(int[] previous) {
        for (int i = 0; i < previous.length; i++) {
            int minIndex = i;//假设当前的是最小的
            for (int j = i + 1; j < previous.length; j++) {
                if (previous[minIndex] > previous[j])
                    minIndex = j;
            }
            if(i!=minIndex)
            SortUtil.swap(i, minIndex, previous);
        }
        return previous;
    }
}
