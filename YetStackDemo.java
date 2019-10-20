import java.util.Arrays;

public class YetStackDemo {
    private  int[]  array;
    private int top;//指向当前栈顶元素的下标
    public YetStackDemo(int defaultCapacity){
        array=new int[defaultCapacity];
        top=-1;
    }
   public YetStackDemo(){
        this(20);
   }

   public void push(int val){
        if(top+1==array.length){
            array= Arrays.copyOf(array,array.length*2);
        }
        array[++top]=val;
   }

   public void pop(){
        if(top<0){
            System.out.println("栈为空，无法删除");
            return ;
        }
        array[top]=0;//可加可不加，将所有空的位置保持为0
       top--;
   }

   public int size(){
        return top+1;
   }
}
