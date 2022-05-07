package 链表.简单;

import 链表.ListNode;

import javax.swing.*;

/**
 * @author Doromv
 * @create 2022-05-07-15:03
 */
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//示例 1：
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
//示例 2：
//输入：l1 = [], l2 = []
//输出：[]
//示例 3：
//输入：l1 = [], l2 = [0]
//输出：[0]
//链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode head=list1.val<= list2.val? list1:list2;
        ListNode cur1=head.next;
        ListNode cur2=head==list1?list2:list1;
        ListNode pre=head;
        while (cur1!=null&&cur2!=null){
            if(cur1.val<=cur2.val){
                pre.next=cur1;
                cur1=cur1.next;
            }else {
                pre.next=cur2;
                cur2=cur2.next;
            }
            pre=pre.next;
        }
        pre.next=cur1==null? cur2:cur1;
        return head;
    }
}
