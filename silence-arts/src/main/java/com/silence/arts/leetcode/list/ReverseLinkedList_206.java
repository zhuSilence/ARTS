package com.silence.arts.leetcode.list;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-10-14 11:23<br>
 * <b>Desc：</b>无<br>
 */
public class ReverseLinkedList_206 {

    /**
     * 创建一个新的临时头结点 myHeader
     * 遍历依次将数据插入 myHeader 后面，提前保存 myHeader 的 next 指针
     * 注意避免指针丢失！！！
     *
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode myHeader = new ListNode(0);
        while (head != null) {
            ListNode tmp = myHeader.next;
            myHeader.next = head;
            head = head.next;
            myHeader.next.next = tmp;
        }
        return myHeader.next;
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
        ListNode listNode = reverseList(ls1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}