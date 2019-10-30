import java.util.PriorityQueue;

public class MyPriorityQueue1030 {
    //不做扩容处理
    private int[] array;
    private int size;
    MyPriorityQueue1030(){
        array=new int[16];
        size=0;
    }
    public void offer(int element){
        array[size++]=element;
        HeapDemo1030.shiftUpSmall(array,size-1);
    }
    public int poll(){
        int element=array[0];
        array[0]=array[--size];
        HeapDemo1030.shiftDownSmall(array,0,size);
        HeapDemo1030.shiftDownSmall(array,0,size);
        return element;
    }
    public int peek(){
        return   array[0];
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.offer(7);
        q.offer(9);
        q.offer(5);
        System.out.println(q.poll());
        MyPriorityQueue1030  queue=new MyPriorityQueue1030();
        queue.offer(7);
        queue.offer(9);
        queue.offer(5);
        System.out.println(queue.poll());
        queue.offer(3);
        System.out.println(queue.poll());
        queue.offer(10);
        queue.offer(8);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
