package 链表.困难;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-04-13-14:16
 */
//给你一个链表，每k个节点一组进行翻转，请你返回翻转后的链表。
//
//k是一个正整数，它的值小于或等于链表的长度。
//
//如果节点总数不是k的整数倍，那么请将最后剩余的节点保持原有顺序。

public class K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start=head;
        ListNode lastNode = lastNode(start, k);
        if (lastNode == null) {
            return head;
        }
        head=lastNode;
        reverse(start, lastNode);
        ListNode temp=start;
        while (temp.next!=null){
            start=temp.next;
             lastNode = lastNode(start,k);
            if (lastNode == null) {
                return head;
            }
            reverse(start,lastNode);
            temp.next=lastNode;
            temp=start;
        }
        return head;
    }
  public  ListNode lastNode(ListNode firstNode, int k) {
        ListNode cur=firstNode;
        while (--k!=0&&cur!=null){
            cur=cur.next;
        }
        return cur;
  }
  public void reverse(ListNode firstNode,ListNode lastNode){
      lastNode = lastNode.next;
      ListNode pre =null;
      ListNode cur = firstNode;
      ListNode next =null;
      while (cur != lastNode) {
          next = cur.next;
          cur.next = pre;
          pre = cur;
          cur = next;
      }
      firstNode.next = lastNode;
  }
}
