package com.silence.arts.pattern.creator.prototype;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-07-12 23:42<br>
 * <b>Desc：</b>无<br>
 */
public class Monkey extends MonkeyPrototype {


    /**
     * 输出内容
     *
     */
    public void message() {
        System.out.println(this.getName() + "-" + this.getAge() + "-" + this.getThings() + "- 金箍棒长度：" + this.getExtraSkill().getWidth());
    }
}
