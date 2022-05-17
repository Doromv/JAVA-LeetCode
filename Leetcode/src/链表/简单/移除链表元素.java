package 链表.简单;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-05-17-14:50
 */
public class 移除链表元素 {
    //给你一个链表的头节点 head 和一个整数 val ，
    // 请你删除链表中所有满足 Node.val == val 的节点，
    // 并返回 新的头节点 。
    public ListNode removeElements(ListNode head, int val) {
        while (head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null){
            return head;
        }
        ListNode pre=head;
        while (pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }else {
                pre=pre.next;
            }
        }
        return head;
    }
}
