package com.silence.arts.niuke;

import java.util.Stack;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-03 00:03<br>
 * <b>Desc：</b>无<br>
 */
public class Solution2 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        copyStack(stack2, stack1);
        stack1.add(node);
    }

    public int pop() {
        copyStack(stack1, stack2);
        return stack2.pop();
    }

    private void copyStack(Stack<Integer> source, Stack<Integer> target) {
        if (source.size() > 0) {
            int i = 0;
            int size = source.size();
            while (i < size) {
                target.add(source.pop());
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(4);
        System.out.println(s.pop());
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
