package SortMethod;

/**
 * Created by fido on 2018/2/13.
 * 工具类
 */
public class SortUtil {
    /**
     * 交换数组对应下标的两个值
     *
     * @param first
     * @param second
     * @param arr
     * @return
     */
    public static int[] swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

    public static void show(int[] arr, String methodName) {
        long start = System.currentTimeMillis();
        System.out.println("使用的是--" + methodName + "--排序结果为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("运行时间为:" + (end - start));
    }

    public static void showArr(int[] arr) {
        System.out.println("本次结果为：---");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
