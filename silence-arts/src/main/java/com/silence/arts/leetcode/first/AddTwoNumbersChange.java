package com.silence.arts.leetcode.first;

import java.util.LinkedList;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-07-08 11:57<br>
 * <b>Desc：</b>无<br>
 */
public class AddTwoNumbersChange {

    // TODO: 2018/7/19  
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder add1 = getStingBuild(l1);
        StringBuilder add2 = getStingBuild(l2);
        String num1 = getNew(add1, add2.toString().length());
        String num2 = getNew(add2, add1.toString().length());
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
            ListNode ListNode = new ListNode(val);
            list.add(ListNode);
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


    private static StringBuilder getStingBuild(ListNode ListNode) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode p = ListNode;
        while (p.next != null) {
            stringBuilder.append(p.val);
            p = p.next;
        }
        stringBuilder.append(p.val);
        return stringBuilder;
    }

    private static String getNew(StringBuilder first, int length) {
        String num1 = first.toString();
        if (num1.length() < length) {
            for (int i = 0; i < length - num1.length(); i++) {
                first.append(0);
            }
        }
        return first.toString();
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

