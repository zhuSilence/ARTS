package com.silence.arts.leetcode.first;

import java.util.HashMap;
import java.util.Map;

/**
 * <br>
 * <b>功能：</b><br>
 * <b>作者：</b>@author Silence<br>
 * <b>日期：</b>2018-07-01 11:15<br>
 * <b>详细说明：</b>solve the problem two sum...<br>
 */
public class TwoSum {

    /**
     * solution 1, For the first time, just think about solve it.
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    ints[0] = i;
                    ints[1] = j;
                    break;
                }
            }
        }
        return ints;
    }


    /**
     * Reference other's solution, it's more beautiful, just copy down and record it.
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] tem = new int[]{3, 3};
        int[] result = twoSum.twoSum2(tem, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
