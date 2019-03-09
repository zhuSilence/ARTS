package com.silence.arts.pattern.creator.factory.impl;

import com.silence.arts.pattern.creator.factory.Shape;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-09 23:49<br>
 * <b>Desc：</b>无<br>
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("this is square implements shape");
    }
}
