package com.silence.arts.leetcode.first;

import java.util.Arrays;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-07-02 22:23<br>
 * <b>Desc：</b>无<br>
 */
public class Median_4 {

    /**
     * T System.arraycopy(nums1, 0, sum, 0, nums1.length);
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] sum = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, sum, 0, nums1.length);
        System.arraycopy(nums2, 0, sum, nums1.length, nums2.length);

        Arrays.sort(sum);
        //偶数
        if (sum.length % 2 == 0) {
            int a = sum.length / 2 - 1;
            int b = a + 1;
            median = (sum[a] + sum[b]) / 2.0;
            //奇数
        } else {
            median = sum[sum.length / 2];
        }
        return median;
    }


    public static void main(String[] args) {
//        int[] a = new int[]{1,9,9,7};
        int[] a = new int[]{};
        int[] b = new int[]{2, 3};
//        int[] b = new int[]{5,3,4,9};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
