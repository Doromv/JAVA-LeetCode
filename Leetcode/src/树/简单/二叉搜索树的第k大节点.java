package 树.简单;

import 树.TreeNode;

import java.util.*;

/**
 * @author Doromv
 * @create 2022-04-25-15:03
 */
//给定一棵二叉搜索树，请找出其中第 k 大的节点的值。
//示例 1:
//
//输入: root = [3,1,4,null,2], k = 1
//   3
//  / \
// 1   4
//  \
//   2
//输出: 4
//示例 2:
//
//输入: root = [5,3,6,2,4,null,null,1], k = 3
//       5
//      / \
//     3   6
//    / \
//   2   4
//  /
// 1
//输出: 4

//链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof

public class 二叉搜索树的第k大节点 {
    int count,num;
    public int kthLargest(TreeNode root, int k) {
        this.count=k;
        return num;
    }
    public void f(TreeNode root){
        if(root==null){
            return;
        }
        f(root.right);
        if(--count==0){
            num=root.val;
            return;
        }
        f(root.left);
    }
}
