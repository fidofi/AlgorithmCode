package DesignPattern.Decorator;

/**
 * Created by fido on 2018/2/22.
 * 抽象装饰器父类
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
    }
}
