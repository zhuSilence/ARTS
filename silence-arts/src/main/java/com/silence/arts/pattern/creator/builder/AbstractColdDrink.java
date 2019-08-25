package com.silence.arts.pattern.creator.builder;

import com.silence.arts.pattern.creator.builder.impl.Bottle;
import com.silence.arts.pattern.creator.builder.inter.Item;
import com.silence.arts.pattern.creator.builder.inter.Packing;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-10 22:54<br>
 * <b>Desc：</b>无<br>
 */
public abstract class AbstractColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 0;
    }
}
