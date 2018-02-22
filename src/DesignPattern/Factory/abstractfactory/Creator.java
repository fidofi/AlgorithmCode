package DesignPattern.Factory.abstractfactory;

/**
 * Created by fido on 2018/2/22.
 * 抽象工厂接口
 */
public interface Creator {
    ProductA createProductA();

    ProductB createProductB();
}
