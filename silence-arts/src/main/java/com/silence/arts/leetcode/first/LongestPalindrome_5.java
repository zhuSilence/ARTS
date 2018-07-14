package com.silence.arts.leetcode.first;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-07-12 22:50<br>
 * <b>Desc：</b>无<br>
 */
public class LongestPalindrome_5 {

    /**
     * Brute Force
     * 1. 找出所有的子串依次遍历判断是否是回文字符串
     * 2. 如果是回文串，并且长度比len大，则更新结果
     *
     * 1. find all substrings and find the longest Palindromic substring
     * 2. while k == end (odd numbers) or k + 1 == end (even numbers) means the substring is Palindromic substring
      *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        String result = s.substring(0, 1);
        int len = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                for (int k = 0; k < substring.length(); k++) {
                    int end = substring.length() - k - 1;
                    if (substring.length() >= len && substring.charAt(k) == substring.charAt(end)) {
                        if (((k == end) || (k + 1 == end))) {
                            if (substring.length() > len) {
                                len = Math.max(len, substring.length());
                                result = substring;
                            }
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        System.out.println((System.currentTimeMillis() - start));
        return result;
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"));
    }

}
