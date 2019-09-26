import java.util.Arrays;
public class HeapDemo {
    //堆排序
    public static void main(String[] args) {
        int[]  array={5,2,7,4,9,7,0,6,2,1,23,15,16};
        System.out.println( Arrays.toString(array));
        int size=array.length;
        createHeapBig(array,size);
        System.out.println(Arrays.toString(array));
        createHeapSmall(array,size);
        System.out.println(Arrays.toString(array));
    }
    private static void createHeapSmall(int[] array, int size) {
        for(int i=(size-1)/2;i>=0;i--){
            shiftDown2(array,size,i);
        }
    }

    private static void shiftDown2(int[] array, int size, int index) {
        int left=2*index+1;
        while(left<size){
            int min=left;
            int right=index*2+2;
          if(right<size){//只用判断一次所以不能用while,只能用if
                if(array[right]<array[left]){
                    min=right;
                }
            }
            if(array[index]<=array[min]){
                break;
            }
            swap(array,min,index);
            //一定要检查min的堆结构是否被破坏
           index=min;
            left=2*index+1;
        }
    }

    //建大堆
    private static void createHeapBig(int[] array,int size) {
        for(int i=(size-1)/2;i>=0;i--){//从最后一个非叶子节点的子树开始调整
            shiftDown(array,size,i);
        }
    }
    private static void shiftDown(int[] array, int size,int index) {//向下调整
         int left=2*index+1;
         while(left<size){
             int max=left;
             int right=2*index+2;
             if(right<size){
                 //比较左右孩子谁是max
                 if(array[right]>array[left]){
                     max=right;
                 }
             }//走到这里找到了孩子中最大的（得到max的位置）
             //继续判断array[max]和array[index]的大小
             if(array[max]<=array[index]){
                 break;
             }
             swap(array,max,index);
             index=max;//交换完之后可能max所在的结构被破坏
             left=2*index+1;//更新left（左孩子）的值，继续循环判断
         }
    }

    private static void swap(int[] array, int max, int index) {
        int  t=array[max];
        array[max]=array[index];
        array[index]=t;
    }
}
