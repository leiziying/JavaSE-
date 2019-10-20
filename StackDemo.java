import java.util.Arrays;
import java.util.Stack;

public class StackDemo {
    private int[] array;
    private int top;

    public StackDemo(int defaultCapacity) {
        array = new int[defaultCapacity];
        top = 0;
    }

    public StackDemo() {
        this(20);
    }

    //插入数据
    public void push(int val) {
        if (top == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[top++] = val;
    }

    //删
    public void pop() {
        if (top <= 0) {
            System.out.println("栈为空，无法删除");
            return;
        }
        top--;
        array[top] = 0;//可加可不加，把所有为空的位置置为0
    }
    //返回栈顶元素
    public  int  top(){
        if(top<=0) {
            System.out.println("栈为空，无法返回栈顶元素");
            return -1;
        }
        return array[top-1];
    }

    //返回栈的size
    public  int size(){
        return top;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return top==0;
    }
}

