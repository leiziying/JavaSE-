
/*
自定义类型作为作为HashMap的key
                  Hash的element
保证：
  1.覆盖hashCode和equals方法
  2.if（p.equals(q)）{
      p.hashCode()==q.hashCode()
     }
 */
public class HashBucketDemo {
    public static class Node{
        private int key;
        private int value;
        Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private Node[]  arrary=new Node[8];
    private int size=0;
    public int get(int key){
        /*
       key==>int
       int变成合法下标（除留余数法）
       在数组的该下标处的链表中搜索
         */
        int  index=key%arrary.length;
            for (Node cur = arrary[index];cur!=null;cur=cur.next){
                if(key==cur.key){
                    return cur.value;
                }
            }
        return -1;
    }

    public int  put(int key,int value){
        int index=key%arrary.length;

            Node next;
            for(Node cur=arrary[index];cur!=null;cur=cur.next){
                if(cur.key==key){
                    int oldValue=cur.value;
                    cur.value=value;
                    return oldValue;
                }
            }
            Node node=new Node(key,value);
            node.next=arrary[index];
            arrary[index]=node;
            size++;
        return -1;
    }
}
