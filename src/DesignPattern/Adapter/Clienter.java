package DesignPattern.Adapter;

/**
 * Created by fido on 2018/2/22.
 * 类适配器模式
 */
public class Clienter {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter();
        ps2.isPs2();
    }
}
