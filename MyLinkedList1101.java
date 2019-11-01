class Node1101 {
    int val;
    Node1101 next=null;//指向后继节点，最后一个节点的next==null
    Node1101 prev=null;//指向前驱节点，第一个节点的prev==null
    Node1101(int val){
        this.val=val;
    }
}
public class MyLinkedList1101{
    private Node1101  head=null;
    private Node1101 last=null;
    private int size=0;
    //链表的头插
    public void pushFront(int val) {
        Node1101 node = new Node1101(val);//创建一个新节点
        node.next = head;//头插
        if (head != null) {
            head.prev = node;
        } else {
            last = node;
            size++;
        }
    }
        //链表的头删
        public   void  popFront(){                                                                                               {
            if(size<=0){
                System.out.println("空链表无法删除!");
                return ;
            }
          head=head.next;
            if(head!=null){
                head.prev=null;
            }else{
                last=null;
            }
            size--;
        }
        }
        //链表的尾插
        void  pushBack(int val){
          Node1101 node=new Node1101(val);
          if(last==null){
              head=node;
          }else{
              last.next=node;
          }
          node.prev=last;
          last=node;
          size++;
        }
        void popBack(){
        if(size<=0){
            System.out.println("空链表无法删除！");
            return;
        }
        if(last==head){
            head=last=null;
        }else{
            last.prev.next=null;
            last=last.prev;
        }
        size--;
        }
        public void  add(int index,int val){
           if(index<0||index>size){
               System.out.println("下标错误！");
               return ;
           }
           if(index==0){
               pushFront(val);
           }else if(index==size){
               pushBack(val);
           }else{
               Node1101 pos=getNode(index);
               Node1101 node=new Node1101(val);
               node.prev=pos.prev;
               node.next=pos;
               node.prev.next=node;
               node.next.prev=node;
               size++;
           }
    }
    public void remove(int index){
        if(size<=0){
            System.out.println("空链表无法删除");
            return;
        }
        if(index<0||index>=size){
            System.out.println("下标错误！");
            return ;
        }
        if(index==0){
          popFront();
        }else if(index==size-1){
            popBack();
        }else{
            Node1101  pos= getNode(index);
            pos.prev.next=pos.next;
            pos.next.prev=pos.prev;
            size--;
        }
    }
    //代码的复用性
    private Node1101 getNode(int index){
        //不需要校验index的合法性
        //因为使用者add和remove 已经做过类似工作了
        int  backwardIndex=size-index-1;
        Node1101 pos;
        if(index<=backwardIndex){
            pos=head;
            for(int i=0;i<index;i++){
                pos=pos.next;
            }
        }else{
            pos=last;
            for(int i=0;i<backwardIndex;i++){
                pos=pos.prev;
            }
        }
        return pos;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public  void reset(){
        head=last=null;
        size=0;
    }

    public static void main(String[] args) {
        MyLinkedList1101 linkedList1101=new MyLinkedList1101();
        linkedList1101.pushFront(1);
        linkedList1101.pushFront(2);
        linkedList1101.pushFront(3);

    }
    }



