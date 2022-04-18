package 树.中等;

import 树.TreeNode;

import java.util.*;

/**
 * @author Doromv
 * @create 2022-04-18-14:23
 */
public class 二叉树的右视图 {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        TreeNode cur=null;
        queue.add(root);
        HashMap<TreeNode,Integer> levelMap=new HashMap<>();
        levelMap.put(root,1);
        int curLevel=0;
        while (!queue.isEmpty()){
            cur=queue.poll();
            int nodeLevel=levelMap.get(cur);
            if(curLevel<nodeLevel){
                list.add(cur.val);
                curLevel+=1;
            }
            if(cur.right!=null){
                queue.add(cur.right);
                levelMap.put(cur.right,levelMap.get(cur)+1);
            }
            if(cur.left!=null){
                queue.add(cur.left);
                levelMap.put(cur.left,levelMap.get(cur)+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1,new TreeNode(2, null, new TreeNode(5, null, null)),new TreeNode(3, null, new TreeNode(4, null, null)));
        List<Integer> list = rightSideView(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
