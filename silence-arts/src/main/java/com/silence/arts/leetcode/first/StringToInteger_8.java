package com.silence.arts.leetcode.first;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-07-19 23:13<br>
 * <b>Desc：</b>无<br>
 */
public class StringToInteger_8 {


    /**
     * @param str
     * @return
     */
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() > 0) {
            char first = str.charAt(0);
            StringBuilder builder = new StringBuilder();
            if ((first == 43) || (first == 45)) {
                if (first == 45) {
                    builder.append(first);
                }
                str = str.substring(1);
            }
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    builder.append(str.charAt(i));
                    flag = false;
                } else {
                    break;
                }
            }
            if (flag) {
                return 0;
            }
            try {
                if (first != 45) {
                    if (Long.valueOf(builder.toString()).compareTo((long) Integer.MAX_VALUE) > 0) {
                        return Integer.MAX_VALUE;
                    }
                }else {
                    if (Long.valueOf(builder.toString()).compareTo((long) Integer.MIN_VALUE) < 0) {
                        return Integer.MIN_VALUE;
                    }
                }
            } catch (Exception e) {
                if (first != 45) {
                    return Integer.MAX_VALUE;
                }else {
                    return Integer.MIN_VALUE;
                }
            }
            return Integer.valueOf(builder.toString());
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(myAtoi("+9223372036854775809"));
//        String s = "91283472332";
//        System.out.println(s);
//        if (s.compareTo(String.valueOf(Integer.MAX_VALUE)) > 0) {
//            System.out.println(111);
//        }else {
//            System.out.println(0);
//        }

    }
}
