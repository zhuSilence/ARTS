package com.silence.arts.niuke;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2019-06-24 23:06<br>
 * <b>Desc：</b>无<br>
 */
public class TreeMirror {


    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void Mirror(TreeNode root) {

        if (null != root) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if (null != root.left) {
                Mirror(root.left);
            }
            if (null != root.right) {
                Mirror(root.right);
            }
        }
    }




    public static void main(String[] args) {

    }

}
