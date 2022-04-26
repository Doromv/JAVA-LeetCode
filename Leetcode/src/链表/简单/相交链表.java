package 链表.简单;

import 链表.ListNode;

/**
 * @author Doromv
 * @create 2022-04-14-14:40
 */
//给你两个单链表的头节点 headA 和 headB ，
// 请你找出并返回两个单链表相交的起始节点。
// 如果两个链表不存在相交节点，返回 null 。
public class 相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=getListNodeLength(headA);
        int lengthB=getListNodeLength(headB);
        int lengthDifference=Math.abs(lengthA-lengthB);
        ListNode headL=Math.max(lengthA,lengthB)==lengthA? headA:headB;
        ListNode headS=headL==headA? headB:headA;
        ListNode curS=headS;
        ListNode curL=headL;
        while (lengthDifference--!=0){
            curL=curL.next;
        }
        while (curL!=null||curS!=null){
            if(curL==curS){
                return curL;
            }
            curL=curL.next;
            curS=curS.next;
        }
        return null;
    }
    public int getListNodeLength(ListNode head){
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }
}
