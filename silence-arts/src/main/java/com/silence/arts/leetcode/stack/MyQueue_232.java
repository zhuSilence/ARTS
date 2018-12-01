package com.silence.arts.leetcode.stack;

import java.util.Stack;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-12-01 11:57<br>
 * <b>Desc：</b>无<br>
 */
public class MyQueue_232 {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    /** Initialize your data structure here. */
    public MyQueue_232() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return outputStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (outputStack.size() <= 0) {
            if (inputStack.size() > 0) {
                int size = inputStack.size();
                for (int i = 0; i < size; i++) {
                    outputStack.push(inputStack.pop());
                }
            }
        }
        return outputStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputStack.size() <= 0 && outputStack.size() <= 0;
    }


    public static void main(String[] args) {
        MyQueue_232 queue = new MyQueue_232();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        queue.push(3);
        System.out.println(queue.peek());
    }
}
