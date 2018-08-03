package com.silence.arts.leetcode.first;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-07-31 23:38<br>
 * <b>Desc：</b>无<br>
 */
public class PalindromeNumber_9 {

    /**
     * 转换为字符串，然后反转进行比较
     * 注意before.reverse() 会将before改变，不会生成新的内存对象
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        String b = String.valueOf(x);
        StringBuilder before = new StringBuilder(b);
        String after = before.reverse().toString();
        return b.equals(after);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
