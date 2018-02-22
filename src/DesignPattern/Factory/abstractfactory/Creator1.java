package DesignPattern.Factory.abstractfactory;

import DesignPattern.Factory.factory.*;

/**
 * Created by fido on 2018/2/22.
 */
public class Creator1 implements Creator {
    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
}
