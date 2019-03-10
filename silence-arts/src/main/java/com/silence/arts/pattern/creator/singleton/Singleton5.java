package com.silence.arts.pattern.creator.singleton;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 15:45<br>
 * <b>Desc：</b>
 * 登记式/静态内部类
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：一般<br>
 */
public class Singleton5 {

    /**
     * inner static class
     */
    private static class Singleton5Holder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {

    }

    public static final Singleton5 getInstance() {
        return Singleton5Holder.INSTANCE;
    }
}
