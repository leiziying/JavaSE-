import java.util.Arrays;
public class ShellSort {
    public static void main(String[] args) {
        int[] array={3,6,4,1,9,7,6,5,4,0,10,8,21,35};
        System.out.println(Arrays.toString(array));
      shellSort01(array);
        System.out.println(Arrays.toString(array));
    }

    private static void shellSort01(int[] array) {
        int gap=array.length;
        while(true){
            gap=gap/3+1;
            insertSortWithGap01(array,gap);
            if(gap==1){
                break;
            }
        }
    }

    private static void insertSortWithGap01(int[] array, int gap) {
        for(int i=gap;i<array.length;i++){
            int key=array[i];
            int j;
            for(j=i-gap;j>=0&&array[j]>key;j-=gap){
                array[j+gap]=array[j];
            }
            array[j+gap]=key;
        }
    }
}