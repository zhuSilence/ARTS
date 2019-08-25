package com.silence.arts.pattern.creator.prototype;

import lombok.Data;

import java.util.ArrayList;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-07-12 23:38<br>
 * <b>Desc：</b>Monkey 原型类<br>
 */
@Data
public class MonkeyPrototype implements Cloneable {

    private Integer age;
    private String name;
    private ArrayList<String> things;

    private ExtraSkill extraSkill;

    private MonkeyPrototype monkeyPrototype = null;

    @Override
    public MonkeyPrototype clone() {
        try {
            monkeyPrototype = (MonkeyPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkeyPrototype;
    }

}
