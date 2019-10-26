public class ReverseLinkedListDemo {
    public static  class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    public static Node reverseLinkedList(Node head){
        if(head==null){
            System.out.println("空链表，无法逆置");
        }
        Node result=null;
        Node cur=head;
        Node next=cur.next;
        while(cur!=null){
            next=cur.next;
            cur.next=result;
            result=cur;
            cur=next;
        }
        return result;
    }
    public static void Print(Node head){
        if(head==null){
            System.out.println("空链表");
        }
        Node cur=head ;
        while(cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node l1=new Node(1);
        Node l2=new Node(2);
        Node l3=new Node(3);
        Node l4=new Node(4);
        Node l5=new Node(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=null;
        Print(l1);
         Node newHead=reverseLinkedList(l1);
        Print(newHead);
    }
}
