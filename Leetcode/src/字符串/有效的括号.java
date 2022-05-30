package 字符串;

import java.util.Stack;

/**
 * @author Doromv
 * @Description
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * @create 2022-05-30-14:49
 */
public class 有效的括号 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (char cha : chars) {
            switch (cha){
                case '{':
                    stack.push(cha);
                    break;
                case '(':
                    stack.push(cha);
                    break;
                case '[':
                    stack.push(cha);
                    break;
                case '}':
                    if(stack.size()==0||stack.pop()!='{')
                        return false;
                    break;
                case ')':
                    if(stack.size()==0||stack.pop()!='(')
                        return false;
                    break;
                case ']':
                        if(stack.size()==0||stack.pop()!='[')
                            return false;
                    break;
            }
        }
        return stack.size()==0;
    }
}
