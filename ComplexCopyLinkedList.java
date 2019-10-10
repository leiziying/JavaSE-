package demo;

public class ComplexCopyLinkedList {
    public static  class Node{
        int value ;
        Node next=null;
        Node random=null;


        public Node(int value) {
            this.value = value;
        }
    }
    public static Node copyRandomList(Node head) {
        Node cur = head;
        while (cur != null) {
            Node node = new Node(1);
            node.value = cur.value;

        }
        return null;
    }
    public static void main(String[] args) {
        Node l1=new Node(1);
        Node l2=new Node(2);
        Node l3=new Node(3);
        Node l4=new Node(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=null;
        l1.random=l3;
        l2.random=l1;
        l3.random=l3;
        l4.random=null;
        Node cur=l1;
        while(cur!=null){
            System.out.print(cur.value+"--");
            cur=cur.next;
        }
        System.out.println("null");

    }
}
