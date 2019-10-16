import java.util.LinkedList;

/*
用队列实现栈
 */
public class MyStack {
    private LinkedList<Integer>  queue;
    public MyStack(){
        queue=new LinkedList<>();
    }
    public void push(int x){
        queue.addLast(x);
    }

    public int pop(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int v=queue.pollFirst();//队列的第一个元素并删除
            queue.addLast(v);//再将v插入到队列中
        }
        return  queue.pollFirst();

    }

    public int top(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int v=queue.pollFirst();//队列的第一个元素并删除
            queue.addLast(v);//再将v插入到队列中
        }
        int v=queue.pollFirst();
        queue.addLast(v);
        return v;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
