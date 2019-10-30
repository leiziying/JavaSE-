import java.util.Arrays;
import java.util.Random;

public class HeapDemo1030 {
    //向下调整
    public static void shiftDownSmall(int[] array,int index,int size){
        int  left=2*index+1;
        while(left<size){
            int right=left+1;
            int min=left;
            if(right<size){
                if(array[right]<array[left]){
                    min=right;
                }
            }
            if(array[index]>array[min]){
                swap(array,index,min);
                index=min;
                left=2*index+1;
            }else{
                break;
            }
        }
    }
  public static void shiftDownBig(int[] a,int i,int s){
        while(2*i+1<s){
            int m=2*i+1;
            if(m+1<s&&a[m+1]>a[m]){
                m++;
            }
            if(a[i]>=a[m]){
                break;
            }
            swap(a,i,m);
            i=m;
        }
  }
  public  static void  createHeapSmall(int[] a,int s){
        for(int i=(s-2)/2;i>=0;i--){
            shiftDownSmall(a,i,s);
        }
  }
  public static void createHeapBig(int[] a,int s){
        for(int i=(s-2)/2;i>=0;i--){
            shiftDownBig(a,i,s);
        }
  }

/*    public static void main(String[] args) {
        int[]   small={39,15,3,18,40,5,6,51,52,70};
        shiftDownSmall(small,0,small.length);
        System.out.println(Arrays.toString(small));
        int[]  big={100,50,30,25,40,80,70,10,5,20,30,60,70,60,70,5};
        shiftDownBig(big,2,big.length);
        System.out.println(Arrays.toString(big));
        int[] t=new int[10];
        Random  random=new Random(20190922);
        for(int i=0;i<10;i++){
            t[i]=random.nextInt(20);
        }
        System.out.println(Arrays.toString(t));
        createHeapSmall(t,t.length);
        System.out.println(Arrays.toString(t));
    }*/
    private static void swap(int[] array, int index, int min) {
        int temp=array[index];
        array[index]=array[min];
        array[min]=temp;
    }
    public static void shiftUpSmall(int[] array,int i){
        while(i!=0){
            int p=(i-1)/2;
            if(array[p]<=array[i]){
                break;
            }
            swap(array,p,i);
            i=p;
        }
    }
    public static void heapSort(int[]  array){
        createHeapBig(array,array.length);
        for(int i=0;i<array.length;i++){
            swap(array,0,array.length-i-1);
            shiftDownBig(array,0,array.length-i-1);
        }
    }

    public static void main(String[] args) {
        int[]  a={9,4,1,3,7,1,2,2,9,8};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
}
