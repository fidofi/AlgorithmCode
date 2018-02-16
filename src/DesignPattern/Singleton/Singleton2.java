package DesignPattern.Singleton;

/**
 * Created by fido on 2018/2/16.
 * 饱汉式，解决Singleton1的多线程安全问题
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;

    private Singleton2() {
    }

    //加锁
    //效率低下，大多数情况下不需要同步
    public synchronized static Singleton2 getSingleton() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
