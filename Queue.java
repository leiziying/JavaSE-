/*
顺序表实现栈（栈是先进后出的一种数据结构）
 */
//链表实现队列
class  Node{
    int val;
    Node  next;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
    //只传入一个形参
    Node(int val){
        this(val,null);
    }
}
public class Queue {
private Node front=null;//链表的第一个节点
private Node rear=null;//链表的最后一个节点
    private  int size=0;
    //尾插（保证时间复杂度是O(1)）
    public  void  push(int val){
        Node node=new Node(val);
        if(front==null){
            front=node;
        }else{
            rear.next=node;
        }
        rear=node;//更新rear指向链表的最后一个节点
        size++;
    }
    //头删
    public  void  pop(){
        if(size<=0) {
            System.out.println("队列为空");
            return;
        }
        front=front.next;
        if(front==null)
          rear=null;
        size--;

    }

    public  int front(){
        if(size<=0){
            System.out.println("队列为空");
            return -1;
        }
        return front.val;
    }

    public int rear(){
        if(size<=0) {
            System.out.println("队列为空");
            return -1;
        }
        return  rear.val;
    }

    public int size(){
        return  size;
    }

    public  boolean isEmpty(){
        return size==0;
    }
}
