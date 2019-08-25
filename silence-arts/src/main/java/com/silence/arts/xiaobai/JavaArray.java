package com.silence.arts.xiaobai;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-07-28 14:38<br>
 * <b>Desc：</b>无<br>
 */
public class JavaArray {

    public static void main(String[] args) {
        //1 先声明
//        int[] numbers;
        //初始化
//        numbers = new int[]{0, 1, 3, 4, 5};
        int[] numbers = {0, 1, 3, 4, 5};

        //声明并初始化
        int[] numbers2 = new int[]{0, 1, 3, 4, 5};

        //声明大小，后赋值
        int[] numbers3 = new int[7];
        for (int i = 0; i < 7; i++) {
            numbers3[i] = i;
        }

        //普通遍历，注意下标从 0 开始
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        //foreach 遍历
        for (int i : numbers3) {
            System.out.println(i);
        }

    }
}
