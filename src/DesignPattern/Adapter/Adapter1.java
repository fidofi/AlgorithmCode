package DesignPattern.Adapter;

/**
 * Created by fido on 2018/2/22.
 */
public class Adapter1 implements Ps2 {
    private Usb usb;

    public Adapter1(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
