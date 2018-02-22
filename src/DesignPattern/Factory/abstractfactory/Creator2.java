package DesignPattern.Factory.abstractfactory;

/**
 * Created by fido on 2018/2/22.
 */
public class Creator2 implements Creator {
    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
}
