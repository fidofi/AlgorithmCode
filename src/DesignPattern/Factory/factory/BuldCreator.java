package DesignPattern.Factory.factory;

/**
 * Created by fido on 2018/2/22.
 * 对应其中一种产品的工厂
 */
public class BuldCreator implements Creator {
    @Override
    public Light createLight() {
        return new BuldLight();
    }
}
