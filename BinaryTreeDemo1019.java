import java.util.ArrayList;
import java.util.List;

public class BinaryTreeDemo1019{
   private static  class Node{
       private char val;
      private Node left=null;
       private Node right=null;
       private Node(char val){
           this.val=val;
       }
       @Override
       public  String toString() {
           return String.format("{%c}", val);
       }
    }
   public  static Node  buildTree(){
       Node a=new Node('A');
       Node b=new Node('B');
       Node c=new Node('C');
       Node d=new Node('D');
       Node e=new Node('E');
       Node f=new Node('F');
       Node g=new Node('G');
       Node h=new Node('H');
       a.left=b;a.right=c;
       b.left=d;b.right=e;
       c.left=f;c.right=g;
       e.left=h;
       return a;
   }
   //前序遍历
    public  static void preOrderTraversal(Node root){
       if(root==null){
        return ;
       }
       //根+左子树的前序遍历+右子树的前序遍历
        System.out.println(root);
       preOrderTraversal(root.left);
       preOrderTraversal(root.right);
    }
    //中序遍历
    public  static void inOrderTraversal(Node root){
       if(root==null){
           return ;
       }
       //左子树的中序遍历+根+右子树的中序遍历
        inOrderTraversal(root.left);
        System.out.println(root);
        inOrderTraversal(root.right);
    }
    //后序遍历
    public static void postOrderTraversal(Node  root){
       if(root==null){
           return ;
       }
       //左子树的后序遍历+右子树的后序遍历+根
        postOrderTraversal(root.left);
       postOrderTraversal(root.right);
        System.out.println(root);
    }

    //统计节点个数
    private static int count=0;
    public static void getSize(Node  root){
       if(root==null){
           return ;
       }
       count++;
       getSize(root.left);
       getSize(root.right);
    }

    public static int getSize2(Node  root) {
        if(root==null){
            return 0;
        }
        int left=getSize2(root.left);
        int right=getSize2(root.right);
        return left+right+1;
    }

   private static List<Character>  inOrderList=new ArrayList<>();
    private static void inOrderReturnList(Node  root){
        if(root!=null){
            inOrderTraversal(root.left);
            inOrderList.add(root.val);
            inOrderTraversal(root.right);
        }
    }
    private static List<Character>  inOrderReturnList2(Node  root){
        List<Character>  list=new ArrayList<>();
        if(root==null){
            return list;
        }
        list.addAll(inOrderReturnList2(root.left));
        list.add(root.val);
        list.addAll(inOrderReturnList2(root.right));
        return list;
    }
}