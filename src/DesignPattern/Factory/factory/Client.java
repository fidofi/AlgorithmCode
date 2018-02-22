package DesignPattern.Factory.factory;

/**
 * Created by fido on 2018/2/22.
 * 测试类
 * 此模式相比于简单工厂模式，可以使得用户在拓展一个产品的时候不需要修改原先的代码
 */
public class Client {
    public static void main(String[] args) {
         Creator creator=new BuldCreator();
         Light light=creator.createLight();
         light.turnOn();
         light.turnOff();
         creator=new TubeCreator();
         light=creator.createLight();
         light.turnOn();
         light.turnOff();
    }
}
