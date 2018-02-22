package DesignPattern.Decorator;

/**
 * Created by fido on 2018/2/22.
 * 待装饰对象
 */
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("原来的方法");
    }
}
