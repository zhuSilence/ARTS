package com.silence.arts.xiaobai;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author ziyou<br>
 * <b>Date：</b>2019-07-29 22:29<br>
 * <b>Desc：</b>无<br>
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 4, 7, 8, 3, 5, 2, 6, 8, 9, 1};
        int[] ints = bubbleSort(array);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
