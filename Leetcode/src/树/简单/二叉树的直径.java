package 树.简单;

import 树.TreeNode;

/**
 * @author Doromv
 * @create 2022-04-24-16:46
 */
//给定一棵二叉树，你需要计算它的直径长度。
// 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。
// 这条路径可能穿过也可能不穿过根结点。
//示例 :
//给定二叉树
//
//          1
//         / \
//        2   3
//       / \
//      4   5
//返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
//链接：https://leetcode-cn.com/problems/diameter-of-binary-tree
public class 二叉树的直径 {
    class Solution {
        int ans;
        public int diameterOfBinaryTree(TreeNode root) {
            if(root.left==null&&root.right==null){
                return 0;
            }
            ans = 0;
            depth(root);
            return ans ;
        }
        public int depth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int L = depth(node.left);
            int R = depth(node.right);
            ans = Math.max(ans, L+R);
            return Math.max(L, R) + 1;
        }
    }
}
