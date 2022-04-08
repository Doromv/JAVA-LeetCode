package 树.中等;

import 树.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Doromv
 * @create 2022-04-07-14:49
 */
//给你二叉树的根节点 root 和一个整数目标和 targetSum ，
// 找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
public class 路径总和{
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       LinkedList<Integer> path=new LinkedList<>();
       process(root,targetSum,path);
       return result;
    }
    List<List<Integer>> result=new LinkedList<>();
    public void process(TreeNode root, int targetSum,LinkedList<Integer> path){
        if(root==null){
            return;
        }
        targetSum-=root.val;
        path.add(root.val);
        if(root.left==null&&root.right==null&&targetSum==0){
            result.add(new LinkedList<>(path));
        }
        process(root.left,targetSum,path);
        process(root.right,targetSum,path);
        path.removeLast();
    }
}
