import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

//排序
/*
稳定性：两个相等的数据，如果经过排序后，排序算法能保证其相对位置不发生变化，则我们称该算法是具备稳定性的排序算法
a.clone();可以完全复制一份数组出来
Arrays.sort(a);
插入排序，初始数据越接近有序，时间效率越高
 */
public class Demo0925 {
    //直接插入排序--类似于扑克牌
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {//[0,array.length)也可以
            //保证循环次数为n-1次
            //有序：[0,i)
            //无序：[i,array.length)
            int key = array[i];//array[i]做插入
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {//j是用来比较的数组的下标，倒着找
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }

    public static void insertSort2(int[] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j]>key){
                    array[j+1]=array[j];//往后移
                }else if(array[j]==key){
                    break;
                }else{
                    break;
                }
                array[j+1]=key;
            }
        }
    }
    public static void testSpeed(){
        Random random=new Random(20190925);
        int[]  a=new int[5*10000];//50000个数排序
        for(int i=0;i<5*10000;i++) {
            a[i]=random.nextInt(10*10000);
        }
        long begin=System.nanoTime();
        insertSort(a);
        long end=System.nanoTime();
        double ms=(end-begin)*1.0/1000/1000;
        System.out.printf("一共耗时：%.5f毫秒",ms);
    }
//希尔排序（时间最短）
    /*
    希尔排序是对直接插入排序的优化（分组去做插排）
    当gap>1是都是预排序，目的是让数组更接近于有序，当gap==1时。数组已经接近有序了，这样就会更快，这样就整体而言，可以达到优化的效果
     */
    public static void insertSortWithGap(int[]  array,int gap){
        for(int i=gap;i<array.length;i++){
            int key=array[i];
            int j;
            for(j=i-gap;j>=0&&array[j]>key;j-=gap){
                array[j+gap]=array[j];
            }
            array[j+1]=key;
        }
    }
    public static void shellSort(int[] array){
        int gap=array.length;
        while(true){
            gap=(gap/3)+1;
            insertSortWithGap(array,gap);
            if(gap==1) {//走到这里说明数组已经彻底有序
                break;
            }
        }
    }
/*
选择排序。
堆排序也是选择排序
原理：每一次从无序区间选出最大（或最小）的一个元素，存放在无序区间的最后（或最前），直到全部待排序的数据元素排完
 */
public  static  void selectSort(int[]  array){
    //每次选最大的放在无序区间的最后
    for(int i=0;i<array.length-1;i++){
        //有序在无序的后面
        //无序[0,array.lengtgh-i)
        //有序[array.length-i,array.length)
        int maxIndex=0;
        for(int j=1;j<array.length-i;j++){
            //遍历整个无序区间
            if(array[j]>array[maxIndex]){
                maxIndex=j;
            }
            swap(array,maxIndex,array.length-i-1);//array.length-i-1是无序区间最后一个位置，将整个无序区间的最大值（maxIndex下标对应的数据元素）和无序区间的最后一个元素进行交换
        }
    }
}
//小的往前放
public static void selectSort0(int[] array) {
    //有序区间 [0,i)
    //无序区间[i,array.length)
    for (int i = 0; i < array.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        swap(array, minIndex, i);
    }
}
//大的往后放小的往前放
public static  void selectSort2(int[] array){
        //无序：[begin , end]
    int begin=0;
    int end=array.length-1;
    while(begin<end){
        int minIndex=begin;
        int maxIndex=begin;
        for(int j=begin+1;j<=end;j++){
            if (array[j]<array[minIndex]) {
                minIndex=j;
            }
            if(array[j]>array[maxIndex]){
                maxIndex=j;
            }
        }
        swap(array,minIndex,begin);
        if(maxIndex==begin){
            maxIndex=minIndex;
        }
        swap(array,maxIndex,end);
        begin++;end--;
    }
}



    //堆排序
    /*
    1.建大堆
    2.向下调整
     */
    public static void shiftDownBig(int[]  array,int i,int size){
        while(2*i+1<size){
            int max=2*i+1;
            if(max+1<size&&array[max+1]>array[max]){
                max=max+1;
            }
            if(array[i]>=array[max]){
                return;
            }
            swap(array,i,max);
            i=max;
        }
    }
    //建堆
    private  static void createHeapBig(int[] array){
        for(int i=(array.length-2)/2;i>=0;i--){
            shiftDownBig(array,i,array.length);
        }
    }
    //堆排序（不稳定）
    public static  void heapSort(int []  array){
        createHeapBig(array);
        for(int i=0;i<array.length-1;i++){
            //无序[0,arrary.length-1)
            //交换array[0],array[length-i-1]
            //无序[0,arary.length-i-1)
            //无序长度 array.length-i-1
            //下标0进行向下调整
            swap(array,0,array.length-i-1);
         shiftDownBig(array,0,array.length-i-1);
        }
    }
    //冒泡排序（时间最长）稳定
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            boolean isSort=true;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    isSort=false;
                }
            }
            if(isSort){
                return;
            }
        }
    }
public   static  void swap(int[]  array,int maxIndex,int j){
          int t=array[maxIndex];
          array[maxIndex]=array[j];
          array[j]=t;
}
    public static void main(String[] args) {
        int[]  array={3,5,7,9,3,5,7,1,0,23,8};
        /*System.out.println(Aryrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
         insertSort2(array);
        System.out.println(Arrays.toString(array));
        int[] b=array.clone();
        int[] c=array.clone();
        Arrays.sort(b);
        insertSort2(c);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.equals(b,c));
        //testSpeed();
        shellSort(array);
        System.out.println(Arrays.toString(array));*/
       bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}