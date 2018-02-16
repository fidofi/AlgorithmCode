package DesignPattern;

import DesignPattern.Singleton.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by fido on 2018/2/16.
 */
public class DesignPatternTest {
    public static void main(String[] args) {
        ArrayList<Thread> threadArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    FT ft= Singleton6.SINGLETON_6.getSingleton();
                    System.out.println(ft);
                }
            });
            threadArrayList.add(t1);
        }
        for (Thread thread : threadArrayList) {
          thread.start();
        }

    }


    @Test
    public void testSingleton() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton3.getSingleton().toString());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton3.getSingleton().toString());
            }
        });
        t1.start();
        t2.start();
    }
}
