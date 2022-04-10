package 排序;

/**
 * @author Doromv
 * @create 2022-04-10-14:15
 */
//给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//
//我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
//
//必须在不使用库的sort函数的情况下解决这个问题。
//示例 1：
//
//输入：nums = [2,0,2,1,1,0]
//输出：[0,0,1,1,2,2]
//示例 2：
//
//输入：nums = [2,0,1]
//输出：[0,1,2]
public class 颜色分类 {
    public static void sortColors(int[] nums) {
        int less=0;
        int more=nums.length-1;
        int cur=0;
        while (cur<=more){
            if(nums[cur]>1){
                swap(nums,cur,more--);
            }else if(nums[cur]<1){
                swap(nums,cur++,less++);
            }else {
                cur++;
            }
        }
    }
    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        int[] arr={2,0,1};
        sortColors(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
