package com.silence.arts.leetcode.second;

public class QuickSort {


    public static void main(String[] args) {
        int[] array = new int[]{10, 5, 3, 1, 7, 2, 8, 0};
        quickSort2(array, 0, array.length - 1);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }


    public static void quickSort2(int[] arr, int left, int right) {
        if (left < right) {
            int position = position(arr, left, right);
            quickSort2(arr, left, position - 1);
            quickSort2(arr, position + 1, right);
        }

    }


    public static int position(int[] array, int left, int right) {
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
        //此时 left == right
        array[left] = base;
        return left;
    }
}