import java.util.*;
public class BinaryTree {
    private  static  class Node{
        private  char  val;
        private  Node  left=null;//左子树
        private  Node  right=null;//右子树
        private Node(char val){
            this.val=val;
        }
        @Override
        public String  toString(){
            return  String.format("{%c}",val);
        }
    }
    public  static Node  buildTree(){
        Node  a=new Node('A');
        Node  b=new Node('B');
        Node  c=new Node('C');
        Node  d=new Node('D');
        Node  e=new Node('E');
        Node  f=new Node('F');
        Node  g=new Node('G');
        Node  h=new Node('H');
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        e.right=h;
        return a;
    }
    public static void preOrderTraversal(Node  root){//前序遍历
        if(root==null){//终止条件
            return ;
        }
        //根+左子树前序遍历+右子树前序遍历
        System.out.println(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public  static void  inOrderTraversal(Node root){
        if(root==null){//终止条件
            return;
        }
        //左子树中序遍历+根+右子树中序遍历
        inOrderTraversal(root.left);
        System.out.println();
       inOrderTraversal(root.right);
    }
    public  static  void  postOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        //左子树后序遍历+右子树后序遍历+根
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        postOrderTraversal(root);
    }
}
