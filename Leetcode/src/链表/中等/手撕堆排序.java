package 链表.中等;

/**
 * @author Doromv
 * @create 2022-05-05-21:14
 */
public class 手撕堆排序 {
    public int[] sortArray(int[] arr) {
        if(arr.length<2||arr==null){
            return arr;
        }
        for (int i=arr.length-1;i>=0;i--){
            heapify(arr, i, arr.length);
        }
        int heapSize=arr.length;
        swap(arr,0, --heapSize);
        while (heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0, --heapSize);
        }
        return arr;
    }
        public void heapInsert(int[] arr,int index){
            while (arr[index]>arr[(index-1)/2]){
                swap(arr,index, (index-1)/2);
                index=(index-1)/2;
            }
        }

        public void heapify(int[] arr,int index,int heapSize){
            int left=index*2+1;
            while (left<heapSize){
                int largest =left+1<heapSize&&arr[left+1]>arr[left]? left+1:left;
                largest =arr[largest]>arr[index]? largest :index;
                if(largest ==index){
                    break;
                }
                swap(arr,index, largest);
                index= largest;
                left=index*2+1;
            }
        }
    public void swap(int[] arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
