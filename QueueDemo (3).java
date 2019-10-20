class   Node{
    int val;
    Node next;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
    Node(int val){
        this.val=val;
    }
}
//队列：先进后出
public class QueueDemo {
    private Node  front=null;//链表的第一个节点
    private Node rear=null;//链表的最后一个节点
    private  int size=0;
    //尾插（进队列）
    public  void push(int val){
        Node node=new Node(val);
        //空链表的情况
        if(front==null){
            front=node;
        }else{
            rear.next=node;
        }
        rear=node;
        size++;
    }
    //头删（出队列）
    public void pop(){
        if(size<=0){
            System.out.println("队列为空");
        }
    }
}
