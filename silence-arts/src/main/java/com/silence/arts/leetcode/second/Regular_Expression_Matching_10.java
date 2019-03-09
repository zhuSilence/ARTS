package com.silence.arts.leetcode.second;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Pattern;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-08-06 21:47<br>
 * <b>Desc：</b>无<br>
 */
public class Regular_Expression_Matching_10 {

    public static boolean isMatch(String s, String p) {

        return Pattern.matches(p, s);
    }


    public static void main(String[] args) {
        System.out.println(isMatch("aaa", ".*"));
//        System.out.println(isMatch("aab", "mis*is*p*."));
    }
}
