package com.silence.arts.pattern.creator.factory;

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
public class ShapeFactory {

    private final static String CIRCLE = "CIRCLE";
    private final static String RECTANGLE = "RECTANGLE";
    private final static String SQUARE = "SQUARE";

    /**
     * return different instance depends on different parameter
     *
     * @param shapeName
     * @return
     */
    public Shape getShape(String shapeName) {
        if (CIRCLE.equalsIgnoreCase(shapeName)) {
            return new Circle();
        } else if (RECTANGLE.equalsIgnoreCase(shapeName)) {
            return new Rectangle();
        } else if (SQUARE.equalsIgnoreCase(shapeName)) {
            return new Square();
        }
        return null;
    }
}
