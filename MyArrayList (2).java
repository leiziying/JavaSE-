public class MyArrayList {
    private int[]  array=new int[10];
    private int size;
    public int get(int index){
        if(index<0||index>=size){
            throw  new ArrayIndexOutOfBoundsException();//抛出数组下标越界异常
        }
        return array[index];
        //数组下标越界直接抛出异常结束函数，否则返回该下表的值
    }
    }
