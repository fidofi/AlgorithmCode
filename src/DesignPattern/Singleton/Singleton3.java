package DesignPattern.Singleton;

/**
 * Created by fido on 2018/2/16.
 * 饱汉式，双重锁模式
 */
public class Singleton3 {
    //加上volatile关键字是防止JVM的指令重排序
    private static volatile Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getSingleton() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null)
                    singleton3 = new Singleton3();//这并不是一个原子操作，会发生重排序，有可能出现singleton3是空对象的情况
            }
        }
        return singleton3;
    }
}
