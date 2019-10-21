//题目要求：
/*
给定一个链表，删除链表的倒数第n个节点
 */
public class MyLinkedList {
    public  static class  Node{
      int val;
        Node  next;
        public Node(int val){
            this.val=val;
        }
    }
    //删除第k个节点
    public static Node deleteNode(Node  head,int k){
        if(head==null){
            System.out.println("链表为空无法删除");
            return null;
        }
        int count=0;
        Node prev=head;
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        for(int i=0;i<count-k;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static void  Print(Node head){
        if(head==null){
            System.out.println("空链表");
        }
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.print(cur.val+"-->");
        }
        System.out.println("null");
    }
    public static void main(String[]  args){
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
        deleteNode(l1,2);
        Print(l1);
        }
}
