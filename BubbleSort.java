import java.util.Arrays;

public class BubbleSort {

    public  static  void bulleSort(int[] array){
      for(int i=0;i<array.length-1;i++){
          boolean isSort=true;
          //无序区间：[0,array.length-i-1)
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

    private static void swap(int[] array, int j, int i) {
        int t=array[j];
        array[j]=array[i];
        array[i]=t;
    }

    public static void main(String[] args) {
        int[] array={5,3,1,5,0,7,5,4,2,9};
        bulleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
