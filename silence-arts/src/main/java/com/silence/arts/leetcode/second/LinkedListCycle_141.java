package com.silence.arts.leetcode.second;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-10-21 23:50<br>
 * <b>Desc：</b>无<br>
 */
public class LinkedListCycle_141 {

    /**
     * tow points
     * thinking about two runner are running on the track
     * fast one will catch up the slow one if there is a cycle
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (null == fast || null == fast.next) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
