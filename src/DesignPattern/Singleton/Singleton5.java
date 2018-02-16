package DesignPattern.Singleton;

/**
 * Created by fido on 2018/2/16.
 * Holder模式，既能够懒加载，也能保持饿汉式中的方便
 * 这个会比较方便吗？？？
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 singleton5 = new Singleton5();

        private SingletonHolder() {
        }
    }
    private Singleton5() {
    }
    public synchronized static Singleton5 getSingleton() {
        return SingletonHolder.singleton5;
    }
}
