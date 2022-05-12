package 链表.中等;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-05-12-18:00
 */
//给你一个链表的头节点 head 。删除 链表的 中间节点 ，并返回修改后的链表的头节点 head 。
//长度为 n 链表的中间节点是从头数起第 ⌊n / 2⌋ 个节点（下标从 0 开始），其中 ⌊x⌋ 表示小于或等于 x 的最大整数。
//对于 n = 1、2、3、4 和 5 的情况，中间节点的下标分别是 0、1、1、2 和 2 。
//示例 1：
//输入：head = [1,3,4,7,1,2,6]
//输出：[1,3,4,1,2,6]
//返回结果为移除节点后的新链表。
//示例 2：
//输入：head = [1,2,3,4]
//输出：[1,2,4]
//示例 3：
//输入：head = [2,1]
//输出：[2]
//链接：https://leetcode.cn/problems/delete-the-middle-node-of-a-linked-list
public class 删除链表的中间节点 {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slow=head.next;
        ListNode fast=head.next;
        ListNode temp=head;
        while (fast.next!=null&&fast.next.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=slow.next;
        slow.next=null;
        return head;
    }
}
