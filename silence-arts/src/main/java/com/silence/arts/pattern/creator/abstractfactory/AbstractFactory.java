package com.silence.arts.pattern.creator.abstractfactory;

import com.silence.arts.pattern.creator.factory.Shape;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 00:11<br>
 * <b>Desc：</b>无<br>
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
