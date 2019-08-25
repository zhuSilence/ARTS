package com.silence.arts.pattern.creator.builder;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 22:59<br>
 * <b>Desc：</b>无<br>
 */
public class VegBurger extends AbstractBurger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "vegBurger";
    }
}
