package com.silence.arts.pattern.creator.prototype;

import java.util.ArrayList;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-07-12 23:52<br>
 * <b>Desc：</b>无<br>
 */
public class MonkeyClient {
    public static void main(String[] args) {
        //创建猴哥一号
        Monkey monkey = new Monkey();
        monkey.setName("猴哥一号");
        monkey.setAge(18);
        ArrayList<String> list = new ArrayList<>();
        list.add("七十二变化");
        list.add("火眼睛就");
        monkey.setThings(list);
        ExtraSkill m = new ExtraSkill();
        m.setWidth(1920);
        m.setHeight(1080);
        monkey.setExtraSkill(m);

        //克隆五个猴哥
        System.out.println("--------------------------克隆猴哥----------------------------");
        for (int i = 0; i < 5; i++) {
            Monkey cloneMonkey = (Monkey) monkey.clone();
            cloneMonkey.setAge(cloneMonkey.getAge() + i);
            cloneMonkey.setName(cloneMonkey.getName() + i);
            ArrayList<String> innerThing = cloneMonkey.getThings();
            innerThing.add("特殊技能 " + i);
            cloneMonkey.setThings(innerThing);
            cloneMonkey.getExtraSkill().setWidth(cloneMonkey.getExtraSkill().getWidth() + i * 100);
            cloneMonkey.getExtraSkill().setHeight(cloneMonkey.getExtraSkill().getHeight() + i * 100);
            System.out.println(cloneMonkey.getExtraSkill());
            cloneMonkey.message();
            System.out.println();
        }
        System.out.println("--------------------------猴哥一号----------------------------");
        System.out.println(monkey.getExtraSkill());
        monkey.message();
    }
}
