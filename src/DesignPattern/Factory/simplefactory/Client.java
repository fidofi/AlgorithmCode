package DesignPattern.Factory.simplefactory;

/**
 * Created by fido on 2018/2/21.
 */
public class Client {

    public static void main(String[] args) {
        IProduct product1 = Creator.createProduct("A");
        product1.method();
        IProduct product2 = Creator.createProduct("B");
        product2.method();
    }
}
