package 树.简单;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Doromv
 * @create 2022-04-21-15:47
 */
//给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
public class 翻转二叉树 {
      public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    public TreeNode invertTree(TreeNode root) {
          if (root==null){
              return root;
          }
          processor(root);
          return root;
    }
    public void processor(TreeNode root){
          if (root==null){
              return;
          }
          processor(root.left);
          processor(root.right);
          swap(root);
    }
    public void swap(TreeNode root) {
          TreeNode temp=root.left;
          root.left=root.right;
          root.right=temp;
    }
}
