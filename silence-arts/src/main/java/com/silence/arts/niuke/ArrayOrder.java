package com.silence.arts.niuke;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-03-09 00:17<br>
 * <b>Desc：</b>无<br>
 */
public class ArrayOrder {

    public static void reOrderArray(int[] array) {
        if (array.length > 0) {
            int even = 0;
            int[] newArray = new int[array.length];
            for (int anArray : array) {
                if (anArray % 2 == 0) {
                    even++;
                }
            }
            int odd = 0;
            int even1 = 0;
            for (int anArray : array) {
                if (anArray % 2 != 0) {
                    newArray[odd] = anArray;
                    odd++;
                } else {
                    newArray[array.length - even + even1] = anArray;
                    even1++;
                }
            }
            array = newArray;
            System.out.println(array.length);
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(array);
    }
}
