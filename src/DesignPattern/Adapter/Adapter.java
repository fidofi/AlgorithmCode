package DesignPattern.Adapter;

/**
 * Created by fido on 2018/2/22.
 */
public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
