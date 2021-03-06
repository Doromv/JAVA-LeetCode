package 树.简单;

import 树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Doromv
 * @create 2022-04-21-15:47
 */
//给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
public class 翻转二叉树 {
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
