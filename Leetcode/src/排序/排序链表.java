package 排序;

import javax.swing.text.html.HTMLEditorKit;

/**
 * @author Doromv
 * @create 2022-04-10-13:54
 */
//给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
public class 排序链表 {
    public ListNode sortList(ListNode head) {
        ListNode min=head;
        ListNode cur=head.next;
        ListNode begin= head;
        while (begin.next!=null){
            while (cur.next!=null){
                if(min.val>cur.val){
                    min=cur;
                    cur=cur.next;
                }
            }
            begin=begin.next;
            int temp=min.val;
            min.val=begin.val;
            begin.val=temp;
            cur=begin;
        }
        return head;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
