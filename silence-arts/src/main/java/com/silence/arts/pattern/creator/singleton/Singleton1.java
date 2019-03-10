package com.silence.arts.pattern.creator.singleton;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 15:27<br>
 * <b>Desc：</b>
 * 懒汉式，线程不安全
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：否
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。<br>
 */
public class Singleton1 {
    private static Singleton1 instance;

    /**
     * private Constructor
     */
    private Singleton1() {

    }

    /**
     * return instance of Singleton1
     *
     * @return
     */
    public static Singleton1 getInstance() {
        if (null == instance) {
            return new Singleton1();
        }
        return instance;
    }
}
