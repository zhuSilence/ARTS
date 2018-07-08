package com.silence.arts.leetcode.first;

import java.util.LinkedList;

/**
 * <br>
 * <b>功能：</b><br>
 * <b>作者：</b>@author Silence<br>
 * <b>日期：</b>2018-07-01 12:11<br>
 * <b>详细说明：</b>无<br>
 */
public class AddTwoNumbers_2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder add1 = new StringBuilder();
        ListNode p = l1;
        while (p.next != null) {
            add1.append(p.val);
            p = p.next;
        }
        add1.append(p.val);

        StringBuilder add2 = new StringBuilder();
        ListNode pp = l2;
        while (pp.next != null) {
            add2.append(pp.val);
            pp = pp.next;
        }
        add2.append(pp.val);
        String num1 = add1.toString();
        String num2 = add2.toString();
        if (num1.length() < num2.length()) {
            for (int i = 0; i < num2.length() - num1.length(); i++) {
                add1.append(0);
            }
            num1 = add1.toString();
        }

        if (num2.length() < num1.length()) {
            for (int i = 0; i < num1.length() - num2.length(); i++) {
                add2.append(0);
            }
            num2 = add2.toString();
        }

        StringBuilder builder = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                if (i == j) {
                    int val = Integer.parseInt(String.valueOf(num1.charAt(i)));
                    int val2 = Integer.parseInt(String.valueOf(num2.charAt(j)));
                    int sum = val + val2 + carry;
                    if (sum < 10) {
                        builder.append(sum);
                        carry = 0;
                    } else {
                        builder.append(String.valueOf(sum).substring(1));
                        carry = 1;
                    }
                }
            }
        }

        if (carry > 0) {
            builder.append(carry);
        }
        String result = builder.toString();
        LinkedList<ListNode> list = new LinkedList<>();
        for (int i = 0; i < result.length(); i++) {
            int val = Integer.parseInt(String.valueOf(result.charAt(i)));
            ListNode listNode = new ListNode(val);
            list.add(listNode);
        }
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size()) {
                list.get(i).next = list.get(i + 1);
            } else {
                list.get(i).next = null;
            }
        }
        return list.get(0);
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        l1.next = l2;
        ListNode l3 = new ListNode(3);
        l2.next = l3;
        l3.next = null;


        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        l4.next = l5;
        ListNode l6 = new ListNode(4);
        l5.next = l6;
        l6.next = null;


        ListNode ll = addTwoNumbers(l1, l4);
        System.out.println(ll.val);

    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }


}