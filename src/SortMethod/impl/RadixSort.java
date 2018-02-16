package SortMethod.impl;

import SortMethod.ISort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by fido on 2018/2/15.
 * 基数排序
 */
public class RadixSort implements ISort {

    @Override
    public int[] sort(int[] previous) {
        //先确定所有数中的最大位数，用来表明趟数
        int max = previous[0];
        int maxTime = 0;
        for (int i = 1; i < previous.length; i++) {
            if (previous[i] > max)
                max = previous[i];
        }
        while (max >0) {
            max = max / 10;
            maxTime++;
        }
        //得到maxTime为最大位数
        //建立10个队列
        List<ArrayList> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            list.add(arrayList);
        }
        for (int j = 0; j < maxTime; j++) {
            for (int i = 0; i < previous.length; i++) {
                int current = previous[i];
                //得到当前位数上的大小
                int k = current % (int) Math.pow(10, j + 1) / (int) Math.pow(10, j);
                ArrayList<Integer> currentList = list.get(k);
                currentList.add(current);
                list.set(k,currentList);
            }
            int count = 0;//记录元素的个数
            //重新赋值给数组
            for (int i = 0; i < list.size(); i++) {
                while (list.get(i).size() > 0) {
                    ArrayList<Integer> arrayList = list.get(i);
                    previous[count] = arrayList.get(0);
                    count++;
                    arrayList.remove(0);
                }
            }
        }
        return previous;
    }
}
