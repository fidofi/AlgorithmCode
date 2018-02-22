package DesignPattern.Adapter;

/**
 * Created by fido on 2018/2/22.
 * 接口适配器模式
 * 想要使用接口中的某个或某些方法，但是接口中有太多方法，我们要使用时必须实现接口并实现其中的所有方法，
 * 可以使用抽象类来实现接口，并不对方法进行实现（仅置空），
 * 然后我们再继承这个抽象类来通过重写想用的方法的方式来实现。这个抽象类就是适配器。
 */
public class Clienter2 {
    public static void main(String[] args) {
        A a=new Ashili();
        a.a();
        a.d();
    }
}
