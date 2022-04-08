package 树.简单;

import 树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Doromv
 * @create 2022-04-05-14:25
 */
//给你二叉树的根节点root 和一个表示目标和的整数targetSum 。
//判断该树中是否存在 根节点到叶子节点 的路径，
//这条路径上所有节点值相加等于目标和targetSum 。
//如果存在，返回 true ；否则，返回 false 。
public class 路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode cur;
        queue.add(root);
        while (!queue.isEmpty()){
            cur=queue.poll();
            if(cur.left==null&&cur.right==null){
                if(cur.val==targetSum){
                    return true;
                }else {
                    continue;
                }
            }
            if(cur.left!=null){
                cur.left.val=cur.val+cur.left.val;
                queue.add(cur.left);
            }
            if(cur.right!=null){
                cur.right.val=cur.val+cur.right.val;
                queue.add(cur.right);
            }
        }
        return false;
    }

}
