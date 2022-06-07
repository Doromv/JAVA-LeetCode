package 排序;

import java.awt.font.LayoutPath;

/**
 * @author Doromv
 * @Description
 * @create 2022-06-07-16:49
 */
public class 快排 {

    public static void quickSort(int[] arr) {
        if(arr==null||arr.length<2){
            return;
        }
        process(arr,0, arr.length-1);
    }

    public static void process(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        swap(arr,l+(int)(Math.random()*(r-l)),r);
        int[] partition = partition(arr, l, r);
        process(arr, l,partition[0]-1);
        process(arr, partition[1]+1,r);
    }

    public static int[] partition(int[] arr, int l, int r){
        if(l>r){
            return new int[]{-1,-1};
        }
        if(l==r){
            return new int[]{l,r};
        }
        int less=l-1;
        int more=r;
        int index=l;
        while (index<more){
            if(arr[index]<arr[r]){
                swap(arr,++less, index++);
            }else if(arr[index]>arr[r]){
                swap(arr,--more, index);
            }else {
                index++;
            }
        }
        swap(arr, more, r);
        return new int[]{less+1,more};
    }

    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
