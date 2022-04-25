package 树.中等;

import 树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * @author Doromv
 * @create 2022-04-23-14:36
 */
//给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
//每条从根节点到叶节点的路径都代表一个数字：
//例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
//计算从根节点到叶节点生成的 所有数字之和 。
//叶节点 是指没有子节点的节点。
//输入：root = [1,2,3]
//输出：25
//解释：
//从根到叶子节点路径 1->2 代表数字 12
//从根到叶子节点路径 1->3 代表数字 13
//因此，数字总和 = 12 + 13 = 25
//链接：https://leetcode-cn.com/problems/sum-root-to-leaf-numbers

public class 求根节点到叶节点数字之和 {
    public int sumNumbers(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//          return processor(root);
          return f(root,0);
    }
    //======================参考标答的解法===========================
    public  int f(TreeNode root,int pre){
          if(root==null){
              return 0;
          }
         int temp=pre*10+root.val;
         if(root.left==null&&root.right==null){
             return temp;
         }
         return f(root.left,temp)+f(root.right,temp);
    }
    //======================自己做出来的解法===========================
    public int processor(TreeNode root){
        LinkedList<String> num=new LinkedList<>();
        ArrayList<LinkedList<String>> list=new ArrayList<>();
        f(root,num,list);
        ArrayList<String> result=new ArrayList<>();
        int sum=0;
        for (LinkedList<String> strings : list) {
            String str="";
            for (String string : strings) {
                str+=string;
            }
            result.add(str);
        }
        for (String s : result) {
            sum+=Integer.valueOf(s);
        }
        return sum;
    }
    public void f(TreeNode root,LinkedList<String> num ,ArrayList<LinkedList<String>> list){
        num.add(String.valueOf(root.val));
        if(root.left==null&&root.right==null){
            list.add(copy(num));
        }
        if(root.left!=null){
            f(root.left,num,list);
        }
        if(root.right!=null){
            f(root.right,num,list);
        }
        num.removeLast();
    }
    public LinkedList<String> copy(LinkedList<String> num){
        LinkedList<String> newNum=new LinkedList<>();
        for (String o : num) {
            newNum.add(o);
        }
        return newNum;
    }
}
