package com.silence.arts.pattern.creator.abstractfactory;

import com.silence.arts.pattern.creator.factory.Shape;
import com.silence.arts.pattern.creator.factory.impl.Circle;
import com.silence.arts.pattern.creator.factory.impl.Rectangle;
import com.silence.arts.pattern.creator.factory.impl.Square;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-09 23:49<br>
 * <b>Desc：</b>无<br>
 */
public class ShapeFactory extends AbstractFactory {

    private final static String CIRCLE = "CIRCLE";
    private final static String RECTANGLE = "RECTANGLE";
    private final static String SQUARE = "SQUARE";

    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * return different instance depends on different parameter
     *
     * @param shapeName
     * @return
     */
    @Override
    public Shape getShape(String shapeName) {
        if (null == shapeName) {
            return null;
        }
        Shape shape = null;
        switch (shapeName.toUpperCase()) {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }
}
