package 链表.中等;

import 链表.ListNode;

import java.util.Stack;

/**
 * @author Doromv
 * @create 2022-04-26-16:43
 */
//给定两个用链表表示的整数，每个节点包含一个数位。
//这些数位是反向存放的，也就是个位排在链表首部。
//编写函数对这两个整数求和，并用链表形式返回结果。
//
//示例：
//输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
//输出：2 -> 1 -> 9，即912
//进阶：思考一下，假设这些数位是正向存放的，又该如何解决呢?
//示例：
//输入：(6 -> 1 -> 7) + (2 -> 9 -> 5)，即617 + 295
//输出：9 -> 1 -> 2，即912
//链接：https://leetcode-cn.com/problems/sum-lists-lcci
public class 链表求和 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int nodeNumber1=nodeNumber(l1);
        int nodeNumber2=nodeNumber(l2);
        ListNode listBig=nodeNumber1>nodeNumber2? l1:l2;
        ListNode listSmall=listBig==l1? l2:l1;
        ListNode head=listBig;
        int flag=0;
        ListNode temp=null;
        while (listSmall!=null){
            listBig.val=listBig.val+listSmall.val+flag;
            flag=0;
            if(listBig.val>=10){
                flag=1;
                listBig.val= listBig.val%10;
            }
            temp=listBig;
            listBig=listBig.next;
            listSmall=listSmall.next;
        }

        while (listBig!=null){
            if(flag==1){
                listBig.val=listBig.val+flag;
                flag=listBig.val/10;
                listBig.val%=10;
            }
            temp=listBig;
            listBig=listBig.next;
        }
        if(flag==1){
            temp.next=new ListNode(flag);
        }
        return head;
    }
    public int nodeNumber(ListNode head){
        int nodeNumber=0;
        while (head!=null){
            nodeNumber++;
            head=head.next;
        }
        return nodeNumber;
    }
//    public Integer f(ListNode head){
//        int sum=0;
//        Stack<Integer> stack=new Stack<>();
//        while (head.next!=null){
//            stack.add(head.val);
//            head=head.next;
//        }
//        while (!stack.isEmpty()){
//            sum=sum*10+stack.pop();
//        }
//        return sum;
//    }
}
