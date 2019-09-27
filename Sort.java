import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array={3,5,1,7,4,9,4,8,6,8,5,0,2,233,32,1};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }
    //直接插入排序
    public static void insertSort(int[] array){
        for(int i=1;i<array.length;i++){
            //有序  [0,i)
            //无序  [i,array.length)
            int key=array[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j]<=key){
                    break;
                }else{
                    array[j+1]=array[j];
                }
            }
            array[j+1]=key;
        }
    }


    public static void inserSort0(int[] array){
        for(int i=1;i<array.length;i++){
            //有序  [0,i)
            //无序  [i,array.length)
            int key=array[i];
            int j;
            for(j=i-1;j>=0&&array[j]>key;j--){
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }
    }


    public static void shellSort(int[] array){
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

    private static void insertSortWithGap(int[] array, int gap) {
        for(int i=gap;i<array.length;i++){
            int key=array[i];
            int j;
            for(j=i-1;j>=0&&array[j]>key;j-=gap){
                array[j+gap]=array[j];
            }
            array[j+gap]=key;
        }
    }


    public static void selectSort(int[]  array){
        for(int i=0;i<array.length-1;i++) {
            //无序区间  [i,array.length)
            int minIndex=i;
            for(int j=i+1;j<array.length;j++){
               if(array[i]<array[minIndex]){
                   minIndex=j;
               }
            }
            swap(array,minIndex,i);
        }
    }
 public  static  void selectSort2(int[] array){
        //无序  [begin,end]
     int begin=0;
     int end=array.length-1;
     while(begin<end){
         int minIndex=begin;
         int maxIndex=begin;
         for(int j=begin+1;j<=end;j++){
             if(array[j]<array[minIndex]){
                 minIndex=j;
             }
             if(array[j]>array[maxIndex]){
                 maxIndex=j;
             }
         }
     }
 }
    private static void swap(int[] array, int minIndex, int i) {
        int t=array[i];
        array[i]=array[minIndex];
        array[minIndex]=t;
    }
}
