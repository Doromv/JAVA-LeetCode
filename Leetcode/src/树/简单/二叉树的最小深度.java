package 树.简单;

import 树.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Doromv
 * @create 2022-04-27-16:34
 */
public class 二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        HashMap<TreeNode,Integer> levelMap=new HashMap<>();
        queue.add(root);
        levelMap.put(root,1);
        int result=0;
        while (!queue.isEmpty()){
            TreeNode cur=queue.poll();
            if (cur.left==null&&cur.right==null){
               result=levelMap.get(cur);
               break;
            }
            if(cur.left!=null){
                queue.add(cur.left);
                levelMap.put(cur.left,levelMap.get(cur)+1);
            }
            if(cur.right!=null){
                queue.add(cur.right);
                levelMap.put(cur.right,levelMap.get(cur)+1);
            }
        }
        return result;
    }
}
