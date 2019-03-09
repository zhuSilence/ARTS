package com.silence.arts.leetcode.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-02-16 11:17<br>
 * <b>Desc：</b>无<br>
 */
public class SlidingWindowMaximum_239 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};

        int[] ints = maxSlidingWindow(nums, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (null == nums || nums.length <= 0) return nums;
        List<Integer> result = new ArrayList<>(nums.length - k + 1);
        Deque<Integer> window = new ArrayDeque<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (window.size() < k) {
                window.add(nums[i]);
            } else if(window.size() == k) {
                result.add(getQueueMax(window));
                window.pop();
                i--;
            }
        }
        if(window.size() == k) {
            result.add(getQueueMax(window));
        }
        int[] a = new int[result.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = result.get(i);
        }
        return a;
    }

    private static int getQueueMax(Deque<Integer> deque) {
        final int[] max = {deque.getFirst()};
        deque.forEach(d -> {
            if (d > max[0]) {
                max[0] = d;
            }
        });
        return max[0];
    }

}
