package DesignPattern.Factory.factory;

/**
 * Created by fido on 2018/2/22.
 */
public class TubeLight implements Light {
    @Override
    public void turnOff() {
        System.out.println("TubeLightTurnOff..");
    }

    @Override
    public void turnOn() {
        System.out.println("TubeLightTurnOn..");
    }
}
