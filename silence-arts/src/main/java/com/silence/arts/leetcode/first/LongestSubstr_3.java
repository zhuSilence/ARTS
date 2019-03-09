package com.silence.arts.leetcode.first;

import java.util.*;

/**
 * <br>
 * <b>功能：</b><br>
 * <b>作者：</b>@author Silence<br>
 * <b>日期：</b>2018-07-02 22:08<br>
 * <b>详细说明：</b>无<br>
 */
public class LongestSubstr_3 {

    // TODO: 2018/7/2  
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;


//        int n = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < n && j < n) {
//            // try to extend the range [i, j]
//            if (!set.contains(s.charAt(j))){
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }
//            else {
//                set.remove(s.charAt(i++));
//            }
//            System.out.println("i --:" + i +" ,, j " + j);
//        }
//        return ans;


//        long start = System.currentTimeMillis();
//        if (null == s) {
//            throw new IllegalArgumentException();
//        }
//        int len = 0;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j <= s.length(); j++) {
//                if (allUnique(s, i, j)) {
//                    len = Math.max(len, j - i);
//                }
//            }
//        }
//        System.out.println("耗时：" + (System.currentTimeMillis() - start));
//        return len;
    }


    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }


    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("abcabcab");
//        int length = lengthOfLongestSubstring("mplehtxsslkitcpqlrzsiqbsjyoedarpseubxttrgfbbhqtsktmslpkwpbasbtk");
//        int length = lengthOfLongestSubstring("xvitpvhatbezoawnpkwjkpbummzdzhayxvitpvhatbezoawnpkwjkpbumdmzdzhayflrugawcbabrayhrkdcxsdrgsrmrampfzibgkxinzlgbflrugawcbabrayhrkdcxsdrgsrmrampfzibgkxinzlgb");
        System.out.println(length);
    }

}
