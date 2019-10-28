import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree02 {
    public  static Node02  biuldTree(){
        Node02  n1=new  Node02(1);
        Node02  n2=new Node02(2);
        Node02  n3=new Node02(3);
        Node02  n4=new Node02(4);
        Node02 n5=new Node02(5);
        Node02 n6=new Node02(6);
        n1.left=n2;n1.right=n3;
        n2.left=n4;
        n3.left=n5;n3.right=n6;
        return n1;
    }

    public  static void preorder(Node02  root){
        Stack<Node02>   stack=new Stack<>();
        Node02 cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                System.out.println(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            Node02 top=stack.pop();
            cur=top.right;
        }
    }

    public  static void inorder(Node02 root){
        Stack<Node02>  stack=new Stack<>();
        Node02 cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node02 top=stack.pop();
            System.out.println(top.val);
            cur=top.right;
        }
    }

    public static void postorder(Node02  root){
        Stack<Node02>  stack=new Stack<>();
        Node02 cur=root;
        Node02 last=null;//上次被遍历完的节点
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node02  top=stack.peek();
            if(top.right==null||top.right==last){
                System.out.println(top.val);
                stack.pop();
                last=top;
            }else{
                cur=top.right;
            }
        }
    }

    public List<Integer> preorderTraversal(Node02  root){
        List<Integer>  list=new ArrayList<>();
        Stack<Node02>  stack=new Stack<>();
        Node02  cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                list.add(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            Node02 top=stack.pop();
            cur=top.right;
        }
        return list;
    }

    public static void main(String[] args) {
        Node02  root=biuldTree();
        preorder(root);
        System.out.println("==========================");
        inorder(root);
        System.out.println("==========================");
        postorder(root);
    }
}
