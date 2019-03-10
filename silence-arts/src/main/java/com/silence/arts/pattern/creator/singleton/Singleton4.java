package com.silence.arts.pattern.creator.singleton;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 15:39<br>
 * <b>Desc：</b>
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂<br>
 */
public class Singleton4 {
    /**
     * volatile keyword
     */
    private volatile static Singleton4 instance;

    /**
     * private constructor
     */
    private Singleton4() {

    }


    public static Singleton4 getInstance() {
        if (null == instance) {
            synchronized (Singleton4.class) {
                if (null == instance) {
                    return new Singleton4();
                }
            }
        }
        return instance;
    }
}
