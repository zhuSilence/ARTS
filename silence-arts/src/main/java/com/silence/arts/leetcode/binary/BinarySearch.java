package com.silence.arts.leetcode.binary;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-10-29 22:53<br>
 * <b>Desc：</b>二分查找变形题目<br>
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        System.out.println(bsearch4(a, a.length, 12));
    }

    /**
     * 变形一：二分查找变形题，查找第一个值等于给定值的元素下标
     * int[] a = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
     * 如查找8，应该返回5
     *
     * @param array
     * @param n
     * @param value
     * @return
     */
    private static int bsearch1(int[] array, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] > value) {
                high = mid - 1;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == 0 || array[mid - 1] != value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }


    /**
     * 变形二：查找最后一个值等于给定值的元素
     *
     * @param array
     * @param n
     * @param value
     * @return
     */
    private static int bsearch2(int[] array, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] > value) {
                high = mid - 1;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                if (mid == n - 1 || array[mid + 1] != value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }


    /**
     * 变形三：查找第一个大于等于给定值的元素
     *
     * @param array
     * @param n
     * @param value
     * @return
     */
    private static int bsearch3(int[] array, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] >= value) {
                if ((mid == 0) || (array[mid - 1] < value)) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    /**
     * 变形四：查找最后一个小于等于给定值的元素
     * int[] a = {1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
     * 如value = 12，则应该返回11的下标8
     * System.out.println(bsearch4(a, a.length, 12));
     *
     * @param array
     * @param n
     * @param value
     * @return
     */
    private static int bsearch4(int[] array, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == n - 1 || array[mid + 1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

}
