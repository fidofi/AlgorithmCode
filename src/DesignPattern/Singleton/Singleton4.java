package DesignPattern.Singleton;

/**
 * Created by fido on 2018/2/16.
 * 饿汉式
 * 无需加锁就是线程安全的
 * 类一加载就实例化，提前占用系统资源
 */
public class Singleton4 {
    private static  final Singleton4 singleton4 = new Singleton4();

    private Singleton4() {
    }

    public static Singleton4 getSingleton() {
        return singleton4;
    }
}
