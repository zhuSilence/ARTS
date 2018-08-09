package com.silence.arts.leetcode.second;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>
 * <b>Function：</b><br>
 * <b>Author：</b>@author Silence<br>
 * <b>Date：</b>2018-08-07 23:21<br>
 * <b>Desc：</b>无<br>
 */
public class Binary_Tree_Inorder_Traversal_94 {

    private List<Integer> integerList = new ArrayList<>();

    private List<TreeNode> treeNodeList = new ArrayList<>();


    public  List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            getVal(root);
            return integerList;
        }
        return integerList;
    }

    public void getVal(TreeNode root) {
        if (root.left != null) {
            treeNodeList.add(root);
            getVal(root.left);
        } else {
            integerList.add(root.val);
            if (root.right != null) {
                getVal(root.right);
            } else {
                while (treeNodeList.size() > 0) {
                    TreeNode temp = treeNodeList.get(treeNodeList.size() - 1);
                    treeNodeList.remove(treeNodeList.size() - 1);
                    integerList.add(temp.val);
                    if (temp.right != null) {
                        getVal(temp.right);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Binary_Tree_Inorder_Traversal_94 object = new Binary_Tree_Inorder_Traversal_94();
//
//        TreeNode root = new TreeNode(2);
//        TreeNode r1 = new TreeNode(3);
        TreeNode l1 = new TreeNode(1);
//
//        root.left = r1;
//        root.right = null;
//
//        r1.left = l1;
//        r1.right = null;
//
        l1.left = null;
        l1.right = null;
//
        List<Integer> list = object.inorderTraversal(l1);
        System.out.println(list);

//        TreeNode n1 = new TreeNode(1);
//        TreeNode n2 = new TreeNode(2);
//        TreeNode n3 = new TreeNode(3);
//        TreeNode n4 = new TreeNode(4);
//        TreeNode n5 = new TreeNode(5);
//        TreeNode n6 = new TreeNode(6);
//        TreeNode n7 = new TreeNode(7);
//        TreeNode n8 = new TreeNode(8);
//        TreeNode n9 = new TreeNode(9);
//
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = n4;
//        n2.right = n5;
//        n3.left = n6;
//        n3.right = n7;
//        n4.left = n8;
//        n4.right = null;
//        n5.left = n9;
//        n5.right = null;
//        n6.left = null;
//        n6.right = null;
//        n7.left = null;
//        n7.right = null;
//        n8.left = null;
//        n8.right = null;
//
//        List<Integer> list1 = object.inorderTraversal(n1);
//        System.out.println(list1);

//        TreeNode n1 = new TreeNode(4);
//        TreeNode n2 = new TreeNode(1);
//        TreeNode n3 = new TreeNode(2);
//        TreeNode n4 = new TreeNode(3);
//        n1.left = n2;
//        n1.right = null;
//
//        n2.left = n3;
//        n2.right = null;
//
//        n3.left = n4;
//        n3.right = null;
//
//        n4.left = null;
//        n4.right = null;
//
//        List<Integer> list1 = object.inorderTraversal(n1);
//        System.out.println(list1);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}