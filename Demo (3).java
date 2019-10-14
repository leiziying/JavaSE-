package demo;

public class Demo {
    class Node{
        int val;
        Node next;
        Node(int val,Node  next){
            this.val=val;
            this.next=next;
        }
        Node (int val){
            this.val=val;
        }
        public String  toString(){
            return "(Node"+this.val+")";
        }
    }
    //链表的逆置
    Node  reverseList(Node  head){
        Node rHead=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=rHead;
            rHead=cur;
            cur=next;
        }
        return rHead;
    }

    //删除重复节点
    Node deleteDuplicated(Node head){
        if(head==null){
            return null;
        }
        Node prev=null;
        Node p1=head;
        Node p2=head.next;
        while(p2!=null){
            if(p1.val!=p2.val){
                prev=p1;p1=p2;p2=p2.next;
            }else{
                while(p2!=null&&p2.val==p1.val){
                    p2=p2.next;
                }
                if(prev==null) {
                    head=p2;
                }else{
                    prev.next=p2;
                }
                p1=p2;
                if(p2!=null){
                    p2=p2.next;
                }
            }
        }
        return head;
    }

    Node removAll(Node head,int val){
        if(head==null){
            return null;
        }
        Node prev=head;
        Node cur=head.next;
        while(cur!=null){
            if(cur.val==val){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
