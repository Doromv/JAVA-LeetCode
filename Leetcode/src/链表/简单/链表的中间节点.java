package 链表.简单;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-05-17-14:44
 */
public class 链表的中间节点 {
    //给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第二个中间结点。
    //示例 1：
    //输入：[1,2,3,4,5]
    //输出：此列表中的结点 3
    //示例 2：
    //输入：[1,2,3,4,5,6]
    //输出：此列表中的结点 4
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head.next;
        ListNode fast=head.next;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
