import java.util.Arrays;

public class Demo0927 {
    public static void main(String[] args) {
        int[]  array={4,9,12,29,57,3,0,28,3,4,9,90,28,4,2,46,32,2};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[]   array){
        quickSortInter(array,0,array.length-1);
    }

    private static void quickSortInter(int[] array, int left, int right) {
        if(left>=right){
            //直到长度<=1
            return;
        }
        //1.选择基准值array[left]
        //2.做partition
        int pivotIndex=partition3(array,left,right);
        //左边小区间[left,pivotIndex-1]
        //右边小区间[pivotIndex+1,right]
        //分别对左右小区间按同样方式处理
        quickSortInter(array,left,pivotIndex-1);
        quickSortInter(array,pivotIndex+1,right);

    }
//partition 的实现
    private static int partition1(int[] array,int left,int right) {
        int begin=left;
        int end=right;
        int pivot=array[left];
        //[left,begin)    <=pivot
        //(end,right]      >=pivot
        while(begin<end){
            while(begin<end&&array[end]>=pivot){
                end--;
            }
            while(begin<end&&array[begin]<=pivot){
                begin++;
            }
            swap(array,begin,end);
        }
        swap(array,left,begin);
        return begin;
    }
private static int partition2(int[] array,int left,int right){
        int begin=left;
        int end=right;
        int pivot=array[left];
        //[left,begin)    <=pivot
        //(end,right]     >=pivot
    while(begin<end){
        while(begin<end&&array[end]>=pivot){
            end--;
        }
        array[begin]=array[end];
        while (begin<end&&array[begin]<=pivot){
            begin++;
        }
        array[end]=array[begin];
    }
    array[begin]=pivot;
    return begin;
}
private static int partition3(int[] array,int left,int right){
        //array[left]
    //[left+1,right]
    int pivot=array[left];
    int d=left+1;
    for(int i=left+1;i<=right;i++){
        if(array[i]<pivot){
            swap(array,i,d++);
        }
    }
    swap(array,d-1,left);
    return d-1;
}
    private static void swap(int[] array, int begin, int end) {
        int t=array[begin];
        array[begin]=array[end];
        array[end]=t;
    }
}
