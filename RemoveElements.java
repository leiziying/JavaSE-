public class RemoveElements {//删除值为val的节点
    public static Node removeElements(Node  head,int val){
        Node result=null;
        Node last=null;
        Node cur=head;
        while(cur!=null){//遍历所有的节点
            if(cur.val==val){
                cur=cur.next;
                continue;
            }
            //走到这里说明cur.val!=val
            Node  next=cur.next;
            cur.next=null;
            if(result==null){
                result=cur;
            }else{
                last.next=cur;
            }
            last=cur;
            cur=next;
        }
        return result;
    }
   public  static  void Print(Node  head){
        Node  cur=head;
        while(cur!=null){
            System.out.print(cur.val+"-->");
            cur=cur.next;
        }
       System.out.println("null");
   }

    public static void main(String[] args) {
        Node  l1=new  Node(1);
        Node  l2=new  Node(5);
        Node  l3=new  Node(2);
        Node  l4=new  Node(5);
        Node  l5=new  Node(3);
        Node  l6=new  Node(2);
        Node  l7=new  Node(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=null;
        System.out.print("删除前：");
        Print(l1);
        System.out.print("删除后：");
        removeElements(l1,5);
        Print(l1);
    }
}