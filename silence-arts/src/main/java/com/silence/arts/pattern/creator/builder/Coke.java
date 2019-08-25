package com.silence.arts.pattern.creator.builder;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 23:00<br>
 * <b>Desc：</b>无<br>
 */
public class Coke extends AbstractColdDrink {
    @Override
    public String name() {

        return "coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
