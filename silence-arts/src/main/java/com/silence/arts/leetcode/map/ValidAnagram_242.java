package com.silence.arts.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-02-02 21:37<br>
 * <b>Desc：</b>无<br>
 */
public class ValidAnagram_242 {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, Integer> sMap = new HashMap<>(32);
        Map<String, Integer> tMap = new HashMap<>(32);
        sToMap(s, sMap);

        sToMap(t, tMap);

        return sMap.equals(tMap);
    }

    private static void sToMap(String t, Map<String, Integer> sMap) {
        for (int i = 0; i < t.length(); i++) {
            String tmp = String.valueOf(t.charAt(i));
            if (!sMap.containsKey(tmp)) {
                sMap.put(tmp, 1);
            } else {
                sMap.put(tmp, sMap.get(tmp) + 1);
            }
        }
    }


    public static void main(String[] args) {

        String s1 = "anagram";
        String s2 = "anagram";
        System.out.println(isAnagram(s1, s2));
    }
}
