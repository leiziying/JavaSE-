import java.util.Arrays;

public class InsertSort2 {
    //直接插入排序
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //有序：[0,i)
            //无序：[i,array.length)
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] <= key) {
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 0, 1, 9, 8, 4, 3, 2};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
