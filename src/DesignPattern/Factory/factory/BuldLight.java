package DesignPattern.Factory.factory;

/**
 * Created by fido on 2018/2/22.
 * 具体的某个产品
 */
public class BuldLight implements Light {
    @Override
    public void turnOff() {
        System.out.println("BuldLightTurnOff..");
    }

    @Override
    public void turnOn() {
        System.out.println("BuldLightTurnOn..");
    }
}
