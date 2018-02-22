package DesignPattern.Adapter;

/**
 * Created by fido on 2018/2/22.
 */
public class Ashili extends Adapter2 {
    @Override
    public void a() {
        System.out.println("a方法被调用");
    }

    @Override
    public void d() {
        System.out.println("d方法被调用");
    }
}
