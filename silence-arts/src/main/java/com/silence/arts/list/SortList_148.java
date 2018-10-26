package com.silence.arts.list;


import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-10-21 00:23<br>
 * <b>Desc：</b>无<br>
 */
public class SortList_148 {


    public static ListNode sortList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        quickSort2(list, 0, list.size() - 1);
        ListNode node = new ListNode(0);
        for (int i = list.size() - 1; i >= 0; i--) {
            ListNode tmp = node.next;
            node.next = list.get(i);
            node.next.next = tmp;
        }
        return node.next;
    }

    /**
     * 快速排序迭代
     *
     * @param list
     * @param left
     * @param right
     */
    public static void quickSort2(List<ListNode> list, int left, int right) {
        if (left < right) {
            int position = position(list, left, right);
            quickSort2(list, left, position - 1);
            quickSort2(list, position + 1, right);
        }

    }

    /**
     * 找到中间位置
     *
     * @param list
     * @param left
     * @param right
     * @return
     */
    public static int position(List<ListNode> list, int left, int right) {
        int key = list.get(left).val;
        while (left < right) {
            while (right > left && list.get(right).val >= key) {
                right--;
            }
            list.get(left).val = list.get(right).val;

            while (left < right && list.get(left).val <= key) {
                left++;
            }
            list.get(right).val = list.get(left).val;
        }
        list.get(left).val = key;
        return left;
    }


    public static void main(String[] args) {
        ListNode ls1 = new ListNode(7);
        ListNode ls2 = new ListNode(3);
        ls1.next = ls2;
        ListNode ls3 = new ListNode(3);
        ls2.next = ls3;
        ListNode ls4 = new ListNode(2);
        ls3.next = ls4;
        ListNode ls5 = new ListNode(5);
        ls4.next = ls5;
        ls5.next = null;
        ListNode listNode = sortList(ls1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
//        ListNode listNode = ls1;
//        while (ls1 != null) {
//            if (null == ls1.next) {
//                System.out.println(ls1.val);
//            }
//            ls1 = ls1.next;
//        }
    }

}


//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}