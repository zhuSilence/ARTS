package com.silence.arts.leetcode.first;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-07-18 23:52<br>
 * <b>Desc：</b>无<br>
 */
public class ReverseInteger_7 {

    /**
     * 判断数字是否是负数，负数则截取第一位符号位
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int resultNext;
        try {
            if (x < 0) {
                String string = String.valueOf(x);
                String prev = string.substring(0, 1);
                StringBuilder next = new StringBuilder(string.substring(1));
                resultNext = Integer.parseInt(prev + Integer.parseInt(next.reverse().toString()));
            }else {
                StringBuilder string = new StringBuilder(String.valueOf(x));
                resultNext = Integer.parseInt(string.reverse().toString());
            }
        }catch (Exception e) {
            resultNext = 0;
        }
        return resultNext;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
//        System.out.println(Math.pow(2,31));
    }
}
