package com.silence.arts.niuke;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-11 23:17<br>
 * <b>Desc：</b>无<br>
 */
public class Solution3 {

    public static ListNode FindKthToTail(ListNode head, int k) {
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++) {
            if (i >= k) {
                q = q.next;
            }
            p = p.next;
        }
        return i < k ? null : q;
    }


    public static void main(String[] args) {
        ListNode ls1 = new ListNode(1);
        ListNode ls2 = new ListNode(2);
        ls1.next = ls2;
        ListNode ls3 = new ListNode(3);
        ls2.next = ls3;
        ListNode ls4 = new ListNode(4);
        ls3.next = ls4;
        ListNode ls5 = new ListNode(5);
        ls4.next = ls5;
        ls5.next = null;
        System.out.println(FindKthToTail(ls1, 2).val);
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
