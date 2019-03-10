package com.silence.arts.pattern.creator.abstractfactory.impl;

import com.silence.arts.pattern.creator.abstractfactory.Color;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 00:09<br>
 * <b>Desc：</b>无<br>
 */
public class GreenColorImpl implements Color {
    @Override
    public void fill() {
        System.out.println(" this is Green color: fill()");
    }
}
