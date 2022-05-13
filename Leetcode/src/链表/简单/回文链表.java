package 链表.简单;

import 链表.ListNode;

import java.util.Stack;

/**
 * @author Doromv
 * @create 2022-05-13-15:55
 */
public class 回文链表 {
    //给定一个链表的 头节点 head ，请判断其是否为回文链表。
    //如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。

    public static boolean isPalindrome1(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode cur=head;
        while (cur!=null){
            stack.add(cur.val);
            cur=cur.next;
        }
        while (head!=null){
            if(head.val !=stack.pop()){
                return false;
            }
            head=head.next;
        }
        return true;
    }

    public static boolean isPalindrome2(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        if(head.next.next==null){
            return head.val ==head.next.val;
        }
        ListNode slow=head.next;
        ListNode fast=head.next.next;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=slow;
        ListNode cur=slow.next;
        slow.next=null;
        while (cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        ListNode cur2=head;
        while (pre!=null&&cur2!=null){
            if(pre.val !=cur2.val){
                return false;
            }
            pre=pre.next;
            cur2=cur2.next;
        }
        return true;
    }
}
