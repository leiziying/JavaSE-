package demo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//复杂链表的复制含有random的链表
public class CopyRandomList {
    private class Node{
       private int value;
       private Node next;
       private Node random;

        private Node(int value, Node next, Node random) {
            this.value = value;
            this.next = next;
            this.random = random;
        }
      public   Node(){}
    }
    public  Node copyRandomList(Node head){
        Node cur=head;
        while(cur!=null) {
            Node node=new Node();
            node.value=cur.value;
            node.next = cur.next;
            cur.next = node;
            cur=node.next;
        }
        cur=head;
        while(cur!=null){
            Node node=cur.next;
            if(cur.random!=null) {
                node.random = cur.random.next;
            }else{
                node.random=null;
            }
            cur=node.next;
        }
        cur=head;
        if(head==null){
            return null;
        }
        Node newHead=head.next;
        while(cur!=null){
            Node node=cur.next;
            cur.next=node.next;
            if(cur.next!=null) {
                node.next = cur.next.next;
            }
            cur=cur.next;
        }
        return newHead;
    }
    private static  class NodeComparator implements Comparator<Node> {


        @Override
        public int compare(Node o1, Node o2) {
            return o1.value-o2.value;
        }
    }
    public  Node copyRandomList2(Node head){
        Map<Node,Node> map=new TreeMap<>(new NodeComparator());
        Node newHead=null;
        Node newLast=null;
        Node cur=head;
        while(cur!=null){
            Node node=new Node();
            node.value=cur.value;
            if(newHead==null){
                newHead=node;
            }else{
                newLast.next=node;
            }
            newLast=node;
            map.put(cur,node);
            cur=cur.next;
        }
        cur=head;
        Node  node=newHead;
        while(node!=null){
            if(cur.random!=null) {
                node.random = map.get(cur.random);
            }else{
                node.random=null;
            }
            cur=cur.next;
            node=node.next;
        }
        return newHead;
    }
}
