import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CopyRandomList {
  private  static class Node{
        private int val;
        private Node  next;
        private Node  random;
        private Node(){}
            private Node(int val,Node next,Node  random){
                this.val=val;
                this.next=next;
                this.random=random;
            }
        }
        public static Node copyRandomList(Node  head){
           Node cur=head;
           while(cur!=null){
               Node node=new Node();
               node.val=cur.val;
               node.next=cur.next;
               cur.next=node;
               cur=node.next;
           }
           cur=head;
           while(cur!=null){
               Node  node=cur.next;
               if(cur.random!=null){
                   node.random=cur.random.next;
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
               Node  node=cur.next;
               cur.next=node.next;
               if(node.next!=null){
                   node.next=node.next.next;
               }
               cur=cur.next;
           }
           return newHead;
        }

        private static class NodeComparator implements Comparator<Node>{
            @Override
            public int compare(Node o1, Node o2) {
                return o1.val-o2.val;
            }
        }

        private static Node copyRandomList2(Node  head){
                Map<Node,Node> map=new TreeMap<>(new NodeComparator());
                Node newHead=null;
                Node newLast=null;
                Node cur=head;
                while(cur!=null) {
                    Node node = new Node();
                    node.val = cur.val;
                    if (newHead == null) {
                        newHead = node;
                    } else {
                        newLast.next = node;
                    }
                    newLast = node;
                    map.put(cur, node);
                    cur = cur.next;
                }
                    cur=head;
                    Node node=newHead;
                    while(node!=newHead){
                        if(cur.random!=null){
                            node.random=map.get(cur.random);
                        }else{
                            node.random=null;
                        }
                        cur=cur.next;
                        node=node.next;
                    }
                    return newHead;
                }
        }

