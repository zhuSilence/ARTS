package com.silence.arts.pattern.creator.singleton;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 15:31<br>
 * <b>Desc：</b>懒汉式，线程安全
 * 是否 Lazy 初始化：      是
 * 是否多线程安全：         是
 * 实现难度：              易
 * <p>
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。<br>
 */
public class Singleton2 {
    private static Singleton2 instance;

    /**
     * private constructor
     */
    private Singleton2() {
    }

    /**
     * return Singleton2 instance
     *
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (null == instance) {
            return new Singleton2();
        }
        return instance;
    }
}
