package demo02;

import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
/*
需要两个队列来实现
 */
public class MyStack {
    //定义双栈
    private Queue<Integer>  queueA=new LinkedList<>();//用链表实现队列
    private Queue<Integer>  queueB=new LinkedList<>();
    public  void push(int x){
        //保证所有元素都在一个队列中
        if(queueA.isEmpty()){
            queueB.add(x);
        }else{
            queueA.add(x);
        }
    }

    public  int pop(){
        if(queueA.isEmpty()){
            int len=queueB.size();
            for(int i=0;i<len-1;i++){
                //把所有元素依次放入queueA中
                queueA.add(queueB.poll());
            }
            int result=queueB.poll();//队列B的最后一个元素一定是最后进入的，刚好是栈的栈顶元素
            return  result;
        }else{
            int len=queueA.size();
            for(int i=0;i<len-1;i++){
                //把所有元素依次放入queueA中
                queueB.add(queueA.poll());
            }
            int result=queueA.poll();//队列A的最后一个元素一
            // 定是最后进入的，刚好是栈的栈顶元素
            return  result;
        }
    }

    public  int top(){
        if(queueA.isEmpty()){
            int len=queueB.size();
            for(int i=0;i<len-1;i++){
                //把所有元素依次放入queueA中
                queueA.add(queueB.poll());
            }
            int result=queueB.poll();//队列B的最后一个元素一定是最后进入的，刚好是栈的栈顶元素
            queueA.add(result);
            return  result;
        }else{
            int len=queueA.size();
            for(int i=0;i<len-1;i++){
                //把所有元素依次放入queueA中
                queueB.add(queueA.poll());
            }
            int result=queueA.poll();//队列A的最后一个元素一定是最后进入的，刚好是栈的栈顶元素
            queueB.add(result);
            return  result;
        }
    }
    public boolean isEmpty(){
        return queueA.isEmpty()&&queueB.isEmpty();
    }
}
