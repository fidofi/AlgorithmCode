package DesignPattern.Factory.abstractfactory;

/**
 * Created by fido on 2018/2/22.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new Creator1();
        ProductA productA = creator.createProductA();
        ProductB productB = creator.createProductB();
        productA.methodA();
        productB.methodB();

        creator = new Creator2();
        productA = creator.createProductA();
        productB = creator.createProductB();
        productA.methodA();
        productB.methodB();
    }
}
