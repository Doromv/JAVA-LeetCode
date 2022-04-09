package 排序;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Doromv
 * @create 2022-04-09-14:10
 */
//给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
//注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
//    示例 1：
//
//            输入：nums = [10,2]
//            输出："210"
//            示例 2：
//
//            输入：nums = [3,30,34,5,9]
//            输出："9534330"
public class 最大数 {
    public String largestNumber(int[] nums) {
        String[] intToString=new String[nums.length];
        for (int i=0;i<nums.length;i++){
            intToString[i]= String.valueOf(nums[i]);
        }
        Arrays.sort(intToString,(a,b)->{
            return (b+a).compareTo((a+b));
        });
        if(intToString[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<intToString.length;i++){
            sb.append(intToString[i]);
        }
        return String.valueOf(sb);
    }
}
