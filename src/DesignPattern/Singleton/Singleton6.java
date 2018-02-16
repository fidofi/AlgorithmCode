package DesignPattern.Singleton;

/**
 * Created by fido on 2018/2/16.
 * 利用枚举来实现单例模式
 */
public enum Singleton6 {
    SINGLETON_6;

    private Singleton6() {
        ft = new FT();
    }

    private FT ft = null;

    public FT getSingleton() {
        return ft;
    }
}
