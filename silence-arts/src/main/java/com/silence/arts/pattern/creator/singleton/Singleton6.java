package com.silence.arts.pattern.creator.singleton;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 15:50<br>
 * <b>Desc：</b>无<br>
 */
public enum  Singleton6 {
    INSTANCE;

    public void sayHello() {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Singleton6 singleton6 = Singleton6.INSTANCE;
        System.out.println(singleton6);

        Singleton6 singleton7 = Singleton6.INSTANCE;
        System.out.println(singleton7);
    }
}
