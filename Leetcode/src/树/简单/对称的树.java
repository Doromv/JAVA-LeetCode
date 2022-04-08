package 树.简单;

import org.w3c.dom.ls.LSException;
import 树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Doromv
 * @create 2022-04-06-14:07
 */
//给你一个二叉树的根节点 root ，检查它是否轴对称。
public class 对称的树 {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        } else if (root.left== null || root.right == null) {
            return false;
        }
        Queue<TreeNode> left=new LinkedList<>();
        Queue<TreeNode> right=new LinkedList<>();
        left.add(root.left);
        right.add(root.right);
        while (!left.isEmpty()&&!right.isEmpty()){
            TreeNode leftCur=left.poll();
            TreeNode rightCur=right.poll();
            if(leftCur.val!=rightCur.val){
                return false;
            }
            if(leftCur.left==null^rightCur.right==null){
                return false;
            }
            if(leftCur.right==null^rightCur.left==null){
                return false;
            }
            if(leftCur.left!=null){
                left.add(leftCur.left);
            }
            if(leftCur.right!=null){
                left.add(leftCur.right);
            }
            if(rightCur.right!=null){
                right.add(rightCur.right);
            }
            if(rightCur.left!=null){
                right.add(rightCur.left);
            }
        }
        return left.isEmpty()&&right.isEmpty();
    }
}
