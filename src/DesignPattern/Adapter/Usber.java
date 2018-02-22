package DesignPattern.Adapter;

/**
 * Created by fido on 2018/2/22.
 */
public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("USB");
    }
}
