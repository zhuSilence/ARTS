package com.silence.arts.pattern.creator.abstractfactory;

import com.silence.arts.pattern.creator.abstractfactory.impl.BlueColorImpl;
import com.silence.arts.pattern.creator.abstractfactory.impl.GreenColorImpl;
import com.silence.arts.pattern.creator.abstractfactory.impl.RedColorImpl;
import com.silence.arts.pattern.creator.factory.Shape;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 00:14<br>
 * <b>Desc：</b>无<br>
 */
public class ColorFactory extends AbstractFactory {
    private static final String RED = "RED";
    private static final String GREEN = "GREEN";
    private static final String BLUE = "BLUE";

    /**
     * return color by subclass
     *
     * @param color
     * @return
     */
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        Color c = null;
        switch (color.toUpperCase()) {
            case RED:
                c = new RedColorImpl();
                break;
            case GREEN:
                c = new GreenColorImpl();
                break;
            case BLUE:
                c = new BlueColorImpl();
                break;
            default:
                break;
        }
        return c;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
