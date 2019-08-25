package com.silence.arts.xiaobai;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-08-08 15:02<br>
 * <b>Desc：</b>无<br>
 */
public class JavaArray2 {

    public static void main(String[] args) {
        int[][] array = new int[2][2];

        int[][] arrays = {{1, 1}, {2, 2}, {3, 3}};
        for (int[] ints : arrays) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

    }
}
