package 树.中等;

import javax.xml.soap.Node;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Doromv
 * @create 2022-04-20-15:57
 */
//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。（即逐层地，从左到右访问所有节点）
public class 二叉树的层序遍历 {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()){
          List<Integer> list=new LinkedList<>();
          int size=queue.size();
          for (int i=0;i<size;i++){
              TreeNode cur=queue.poll();
              list.add(cur.val);
              if(cur.left!=null){
                  queue.add(cur.left);
              }
              if(cur.right!=null){
                  queue.add(cur.right);
              }
          }
          result.add(0,list);
        }
        return result;
    }
}
