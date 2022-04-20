package 树.中等;

import java.util.*;

/**
 * @author Doromv
 * @create 2022-04-20-16:14
 */
//给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。
// （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[20,9],[15,7]]
public class 二叉树的锯齿形层序遍历 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> list=new LinkedList<>();
            for (int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                if(flag){
                    list.add(cur.val);
                }else {
                    list.add(0,cur.val);
                }
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
            flag=!flag;
            result.add(list);
       }
        return result;
   }

    }
