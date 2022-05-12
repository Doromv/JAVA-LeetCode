package 链表.中等;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-05-12-18:00
 */
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
