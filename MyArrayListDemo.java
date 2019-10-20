public class MyArrayListDemo {
    private int[]  array=new int[10];
    private int size;
    public int get(int index){
        if(index<0||index>=size){
            throw  new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
}
