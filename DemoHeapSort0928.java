import java.util.Arrays;

public class DemoHeapSort0928 {
    public static void main(String[] args) {
        int[] array={34,11,33,12,46,66,2,7,4,87,5,2,8,9,13,0};
        int size=array.length;
        System.out.println(Arrays.toString(array));
        heapSort(array,size);
        System.out.println(Arrays.toString(array));
    }
   private static void heapSort(int[] array,int size){
        for(int i=(size-1)/2;i>=0;i--){
            shiftDown3(array,size,i);
        }
   }
    private static void shiftDown3(int[] array, int size, int index) {
        int left=2*index+1;
        //判断是否有左孩子，完全二叉树没有左孩子就没有呢右孩子
        while(left<size){
            int  right=2*index+2;
            //先假设左孩子是最小的
            int min = left;
          if(right<size) {
              //既有左孩子又有右孩子就需要判断左右孩子谁是最小的
              if (array[right] < array[left]) {
                  //只需要判断一次，所以不能用while只是if
                  min = right;
              }
          }
                //确定最小的孩子对应的下标之后，要对需要比较调整的节点的值和min所对应的节点的值
                if(array[index]<=array[min]){
                    //只要需要调整的位置的值不大于min位置的值就直接结束，否则交换index和min位置的值
                    break;
                }
                swap(array,min,index);
                index=min;
                left=2*index+1;
            }
        }


    private static void swap(int[] array, int min, int index) {
        int t=array[min];
        array[min]=array[index];
        array[index]=t;
    }
}
