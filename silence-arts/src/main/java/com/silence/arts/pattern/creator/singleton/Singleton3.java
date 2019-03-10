package com.silence.arts.pattern.creator.singleton;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 15:34<br>
 * <b>Desc：</b>
 * 饿汉式，线程安全
 * 是否 Lazy 初始化：      否
 * 是否多线程安全：         是
 * 实现难度：              易
 * <p>
 * 描述：这种方式比较常用，但容易产生垃圾对象。<br>
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    /**
     * private constructor
     */
    private Singleton3() {

    }

    /**
     * return Singleton3 instance
     *
     * @return
     */
    public static Singleton3 getInstance() {
        return instance;
    }
}
