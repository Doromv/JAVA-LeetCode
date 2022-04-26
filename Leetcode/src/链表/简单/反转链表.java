package 链表.简单;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-04-26-16:35
 */
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
