package Code;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by fido on 2018/2/17.
 * 袋鼠过河编程题
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] value = new int[length];
        for (int i = 0; i < length; i++) {
            value[i] = scanner.nextInt();
        }
        System.out.println(jump(length, value) + "");
    }

    public static int jump(int length, int[] value) {
        Stack<Integer> stack = new Stack<>();
        int first = value[0];
        boolean over = false;
        stack.push(first);
        int time = 0;//记录跳数
        int jump = 0;
        int index = 0;//当前处于第几个弹簧
        while (!over) {
            jump = first;//上一次经过的弹簧数
            if(index!=length-1&&value[index]==0){
                int peek = stack.pop();
                int previous = index - jump;
                if (peek - 1 > 0) {
                    index = previous + peek - 1;
                    first = value[index];
                    stack.push(peek);
                    time--;
                }
            }
            index = index + first;
            first = value[index];
            time++;
            stack.push(first);
            if (index == length - 1 || (index == length - 2 && first > value[length - 1])) {
                break;
            }
            if (stack.empty()) {
                return -1;
            }
        }
        return time + 1;
    }
}
