package com.silence.arts.xiaobai;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author ziyou<br>
 * <b>Date：</b>2019-07-29 22:59<br>
 * <b>Desc：</b>无<br>
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 4, 7, 8, 3, 5, 2, 6, 8, 9, 1};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = middle(array, left, right);
            quickSort(array, left, middle - 1);
            quickSort(array, middle + 1, right);
        }
    }

    /**
     * 找到中间
     *
     * @param array
     * @param left
     * @param right
     * @return
     */
    private static int middle(int[] array, int left, int right) {

        int base = array[left];
        while (left < right) {
            while (right > left && array[right] >= base) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= base) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = base;
        return left;
    }

}
