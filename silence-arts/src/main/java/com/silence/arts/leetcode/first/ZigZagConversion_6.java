package com.silence.arts.leetcode.first;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-07-17 23:25<br>
 * <b>Desc：</b>无<br>
 */
public class ZigZagConversion_6 {


    // TODO: 2018/7/19  
    public static String convert(String s, int numRows) {
        String[][] strings = new String[numRows][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < numRows; j++) {
                strings[j][i] = String.valueOf(s.charAt(j));
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
