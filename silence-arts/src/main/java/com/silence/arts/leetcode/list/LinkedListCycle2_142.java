package com.silence.arts.leetcode.list;


import java.util.HashSet;
import java.util.Set;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-11-25 15:50<br>
 * <b>Desc：</b>无<br>
 */
public class LinkedListCycle2_142 {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (null == head) {
                return null;
            }
            Set<ListNode> set = new HashSet<>();
            ListNode tmp = head;
            while (tmp.next != null) {
                if (set.contains(tmp)) {
                    return tmp;
                }else {
                    set.add(tmp);
                }
                tmp = tmp.next;
            }
            return null;
        }
    }




    public static void main(String[] args) {

    }
}
