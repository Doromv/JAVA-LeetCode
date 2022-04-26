package 链表.中等;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-04-12-14:41
 */
//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。
// 你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
public class 两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
      ListNode newHead=new ListNode(0);
      newHead.next=head;
      ListNode temp=newHead;
      while (temp.next != null && temp.next.next != null){
          ListNode n1=temp.next;
          ListNode n2=temp.next.next;
          temp.next=n2;
          n1.next=n2.next;
          n2.next=n1;
          temp=n1;
      }
      return newHead.next;
    }
}
