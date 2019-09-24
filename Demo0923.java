import java.util.Arrays;

/*
1.插入排序
9  5  2  7  3  6   4  8  4  3  9做插排
时间复杂度：最坏（n*n）  最好O(n)  平均O(n^2)
int[]  a={...}
a.clone();  可以完全复制一份数组出来
Arrays.sort(a); 可以排序数组
Arrays.equals(a,b);  数组的比较需要Arrays.equals(b,c);
*/
public class Demo0923 {
    public static  void insertSort(int[]  array){
        //有序：[0,i]
        //无须：[i,array.length)
        for (int i = 1; i <array.length ; i++) {
            int key=array[i];
            int j;
            for(j=i-1;j>=0&&array[j]>key;j--){
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[]  array={9,5,2,7,3,6,4,8,4,3,9};
        insertSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        }
    }

    //向下调整
    public static void shiftDownBig(int []  a,int i,int size ){
        while(2*i+1<size){
            int max=2*i+1;
            if(max+1<size&&a[max+1]>a[max]){
                max++;
            }
            if(a[i]>=a[max]){
                break;
            }
            swap(a,i,max);
            i=max;
        }
    }


//希尔排序
 //希尔排序:隔开作比较
    private static void insertSortWithGap(int[] array,int gap){
     for(int i=gap;i<array.length;i++){
            int key=array[i];
            int j;
         for ( j = i-gap; j>=0&&array[j]>key; j-=gap) {
             array[j+gap]=array[i];
         }
         array[j+gap]=key;
        }
    }
    public static void  shellSort(int[] array){
        int gap=array.length;
        while(true){
           gap=gap/3+1;
           //gap=gap/2;
            insertSortWithGap(array,gap);
            if(gap==1){
                break;
            }
        }
    }
	
	
	 //选择排序
    //小的往前放
    public static void  selectSort02(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //无序区间[i,array.length)
            int minIndex = i;
            for (int j = i+1; i < array.length ;j++ ) {
                if(array[j]<array[minIndex]){
                   minIndex=j;
               }
            }
            swap(array,minIndex,i);
        }
    }
    //大的往无序区间的最后放
    public static void swap(int[]  array,int  maxIdex,int j){
        int t=array[maxIdex];
        array[maxIdex]=array[j];
        array[j]=t;
    }
    public  static void selectSort(int[]  array){
        //每次选最大的放到无序区间的最后
        for (int i = 0; i < array.length-1; i++) {
            //无序：[0,array.length-i)
            //有序：[array.length-i,array.length)
            int maxIndex=0;
            for(int j=1;j<array.length-i;j++){//保证循环次数是n-1次
                if(array[j]>array[maxIndex]){
                    maxIndex=j;
                }
            }
            swap(array,maxIndex,i);
        }
    }