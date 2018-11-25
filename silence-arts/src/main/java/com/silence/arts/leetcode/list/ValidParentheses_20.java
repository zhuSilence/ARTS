package com.silence.arts.leetcode.list;


import java.util.*;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-11-25 16:49<br>
 * <b>Desc：</b>无<br>
 */
public class ValidParentheses_20 {

    /**
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if (null != s && s.length() > 0) {
            Map<String, String> map = new HashMap<>();
            map.put(")", "(");
            map.put("]", "[");
            map.put("}", "{");
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                String val = String.valueOf(s.charAt(i));
                if (!map.containsKey(val)) {
                    stack.push(val);
                } else if (stack.size() <= 0 || !map.get(val).equals(stack.pop())) {
                    return false;
                }
            }
            //stack needs empty
            return stack.size() <= 0;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
}
