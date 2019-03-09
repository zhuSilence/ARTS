package com.silence.arts.leetcode.stack;

import org.spark_project.jetty.util.ArrayQueue;

import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-12-01 15:23<br>
 * <b>Desc：</b>无<br>
 */
public class MyStack_225 {

    private Queue<Integer> inputQueue;
    private Queue<Integer> outputQueue;
    /** Initialize your data structure here. */
    public MyStack_225() {
        inputQueue = new ArrayQueue<>();
        outputQueue = new ArrayQueue<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        inputQueue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        top();
       return outputQueue.remove();
    }

    /** Get the top element. */
    public int top() {
        if (outputQueue.size() <= 0) {
            int size = inputQueue.size();
            for (int i = 0; i < size; i++) {
                outputQueue.add(inputQueue.remove());
            }
        }
        return outputQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return inputQueue.size() <= 0 && outputQueue.size() <= 0;
    }

    public static void main(String[] args) {
        MyStack_225 stack = new MyStack_225();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }


}
