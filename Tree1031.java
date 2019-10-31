import javax.xml.soap.Node;
import java.util.Stack;

public class Tree1031 {
    public static Node1031  buildTree(){
        Node1031 n1=new Node1031(1);
        Node1031 n2=new Node1031(2);
        Node1031 n3=new Node1031(3);
        Node1031 n4=new Node1031(4);
        Node1031 n5=new Node1031(5);
        Node1031 n6=new Node1031(6);
        n1.left=n2;n1.right=n3;
        n2.left=n4;
        n3.left=n5;n3.right=n6;
        return n1;
    }
    public static void  preorder(Node1031  root){
        Stack<Node1031>  stack=new Stack<>();
        Node1031  cur=root;
        while(cur!=null&&!stack.isEmpty()){
            while(cur!=null){
                System.out.println(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            Node1031 top=stack.pop();
            System.out.println(top.val);
            cur=top.right;
        }
    }

    public static void inorder(Node1031  root){
        Stack<Node1031> stack=new Stack<>();
        Node1031 cur=root;
        Node1031 last=null;
        while(cur!=null&&stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node1031 top=stack.peek();
            if(top.right==null||top.right==last){
                System.out.println(top.val);
                stack.pop();
                last=top;
            }else{
                cur=top.right;
            }
        }
    }
}
