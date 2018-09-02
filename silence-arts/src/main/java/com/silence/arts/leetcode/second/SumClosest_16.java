package com.silence.arts.leetcode.second;

import java.util.Arrays;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-09-01 22:41<br>
 * <b>Desc：</b>无<br>
 */
public class SumClosest_16 {

    /**
     * 计算两数之间的最短距离
     * j和k的起始值需要变更，不能从0开始，可以减少算法时间复杂度
     * <p>
     * calculate the distance of two numbers, record the min-distance
     * careful the beginning of j and k can not be 0, it can reduce the Time complexity
     *
     * @param nums   input int array
     * @param target input
     * @return output
     */
    private static int threeSumClosest(int[] nums, int target) {

        long start = System.currentTimeMillis();
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int minDistance = Integer.MAX_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(sum - target) < minDistance) {
                        minDistance = Math.abs(sum - target);
                        min = sum;
                    }
                }
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        return min;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{-1, 2, 1, -4};
//        int[] nums = new int[]{1, 1, 1, 0};
//        System.out.println(Math.abs(-1));
        System.out.println(threeSumClosest(nums, 1));
    }
}
