package com.silence.arts.leetcode.stack;

import java.util.PriorityQueue;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-12-01 16:04<br>
 * <b>Desc：</b>无<br>
 */
public class KthLargest_703 {

    /**
     * PriorityQueue is kind of MINI Heap structure
     */
    private PriorityQueue<Integer> queue;
    private int k;

    public KthLargest_703(int k, int[] nums) {
        this.queue = new PriorityQueue<>(k);
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    /**
     * If the size < k that means we just need to add the element then maintain the Heap
     * else if the peek() < val we need to poll() the head of Heap and add the element then maintain the Heap
     * if the peek() > val we do nothing
     * return the peek()
     *
     * @param val
     * @return
     */
    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else if (queue.peek() < val) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}
