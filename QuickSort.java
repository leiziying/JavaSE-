
/*
排序：
  重点-->稳定性：保证排序后相同的数据相对位置不变，则具备稳定性
  一次使得一个数据有序（减治排序）
  插入排序：在无序区间选择第一个数，在有序区间遍历，查找合适的位置插入
  选择排序：遍历无序区间，查找最大数的下标
  冒泡排序：遍历无序区间，通过两两比较，将最大的数挤到最后
  快速排序（重点）
    总览过程：
    1.在排序区间选择一个基准值
    2.遍历整个待排序区间，将比基准值小的（可能包含==）放在基准值的左边
                          将比基准值大的              放在基准值的右边
    3.分治的思想
       对左右的小区间分别用同样的方式处理
       **直到：区间长度==1（有序）   或者  长度==0（没有数）
  重点：partition
  如何做partition?
  类似于数组中奇数在左，偶数在右
  注意：partition不是做快排，只是快排的一个步骤
        partition一定要所有的数据都和基准值比较
        基准值在左先走右边
退化成单支数的两个因素：1.数组的原序列
                        2.基准值的选择
           修改选择基准值的办法：1.选择边上-只有有序/逆序，就是单支树
           随机选择-不能消除单支树，但减少概率
           几数取中（三数取中）
 */
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] array={3,2,7,9,4,6,4,2,23,5,19,20,49};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void quickSort(int[] array){
        quickSortInter(array,0,array.length-1);
    }
    //[left,right]为待排序区间
    private static void quickSortInter(int[]  array,int left,int right){
        if(left>=right){
            //直到长度<=1
            return;
        }
        //1.选择基准值 array[left]
        //2.pivotIndex代表基准值最终停留的下标
        int pivotIndex = partition2(array,left,right);
        //[left,pivotIndex-1]都是小于等于基准值的
        //[pivotIndex+1,right]都是大于等于基准值的
        quickSortInter(array,left,pivotIndex-1);
        quickSortInter(array,pivotIndex+1,right);
    }

    private static int partition01(int[] array, int left, int right) {
        int i=left;
        int j=right;
        int piovt=array[left];
        while(i<j){
            while(i<j&&array[j]>=piovt){
                j--;
            }
            while(i<j&&array[i]<=piovt){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return  i;
    }
//挖坑法
    private static int partition2(int[] array,int left,int right){
        int i=left;
        int j=right;
        int pivot=array[left];
        while(i<j){
            while(i<j&&array[j]>=pivot) {
                j--;
            }
            array[i]=array[j];
            while(i<j&&array[i]<=pivot){
                i++;
            }
            array[j]=array[i];
        }
        array[i]=pivot;
        return i;
    }
    //前后遍历法
    private static int partition3(int[]  array,int left,int right){
        int d=left+1;
        int pivot=array[left];
        for(int i=left+1;i<=right;i++){
            if(array[i]<pivot){
                swap(array,i,d);
                d++;
            }
        }
        swap(array,d,left);
        return d;
    }
    private static void swap(int[] array, int i, int j) {
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
}