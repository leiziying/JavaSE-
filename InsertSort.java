import java.util.Arrays;

//插入排序
/*
思路：
1.清楚无序和有序区间

 */
public class InsertSort{
    //插入排序（普通版）
    public static  void insertSort(int[] array){
        //无序：[0,i)
        //有序：[i,array.length)
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j]>key){
                    array[j+1]=array[j];
                } else if (array[j]==key) {
                    break;
                }else{
                    break;
                }
            }
            array[j+1]=key;
        }
    }
    //插入排序优化版
    public static void insertSort2(int[]  array){
        for(int i=1;i<array.length;i++){
           int key=array[i];
           int j;
           for(j=i-1;j>=0&&array[j]>key;j--){
               array[j+1]=array[j];
           }
           array[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[]  array={4,6,3,9,6,2,5,1,0,32,45,16};
        //selectSort(array);
        System.out.println(Arrays.toString(array));
      insertSort(array);
        System.out.println(Arrays.toString(array));
       insertSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
