package DesignPattern.Singleton;

/**
 * Created by fido on 2018/2/16.
 * 单例模式
 * 饱汉式，线程不安全
 */
public class Singleton1 {
    private static Singleton1 singleton1 = null;

    private Singleton1() {
    }

    public static Singleton1 getSingleton() {
        //懒加载
        //多线程环境下不安全
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
