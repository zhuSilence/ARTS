package com.silence.arts.niuke;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-04-03 23:06<br>
 * <b>Desc：</b>无<br>
 */
public class Solution4 {


    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode res = null;
        if (list1.val < list2.val) {
            res = list1;
            res.next = Merge(list1.next, list2);
        } else {
            res = list2;
            res.next = Merge(list1, list2.next);
        }
        return res;
    }


    public static void main(String[] args) {

        System.out.println("00");
    }
}
