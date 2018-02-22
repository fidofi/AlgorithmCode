package DesignPattern.Factory.factory;

/**
 * Created by fido on 2018/2/22.
 */
public class TubeCreator implements Creator {
    @Override
    public Light createLight() {
        return new TubeLight();
    }
}
