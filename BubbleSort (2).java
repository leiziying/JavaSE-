package demo01;
//冒泡排序
public class BubbleSort {
    void  BubbleSort(int array[],int  size){
        int isSorted;
        for(int i=0;i<size-1;i++){
            isSorted=1;
            //一次冒泡过程
            for(int j=0;j<size-1-i;j++){
                if(array[j]>array[j+1]){
                    Swap(array,i,j);
                    isSorted=0;
                }
            }
            //一次冒泡结束
            if( isSorted==1){
                break;
            }
        }
    }
    private void Swap(int[]  array,int i,int j) {
        int t=array[i];
        array[i]=array[j];
        array[j]=t;
    }
}
