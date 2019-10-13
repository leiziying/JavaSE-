public class MyLinkedList<E> {
    public static class Node<F>{
       private F val;
       private Node<F>  next;
       private Node(F f){
           val=f;
           next=null;
        }
    }
    Node<E>  head;
    private int size;
    public MyLinkedList(){
        head=null;
        size=0;
    }
    //头插
    public void pushFront(E e){
        Node<E>  node=new Node<>(e);
        node.next=head;
        head=node;
        size++;
    }
    //尾插
    public void  pushBack(E e){
        if(size==0){
            pushFront(e);
            return;
        }
        Node<E> cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new Node<E>(e);
        size++;
    }
}
