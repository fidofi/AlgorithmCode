package DesignPattern.Adapter;

/**
 * Created by fido on 2018/2/22.
 * 对象适配器模式
 * 不改变原有接口的情况下，使用新的接口
 */
public class Clienter1 {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter1(new Usber());
        ps2.isPs2();
    }
}
