import java.util.ArrayList;
import java.util.List;

public class DemoBinaryTree02 {
    //定义树的节点类
    public static class Node{
       public char val;
       public Node left;
       public Node  right;
       private Node(char val){
           this.val=val;
       }
       @Override
       public  String  toString(){
           return String.format("{%c}",val);//format(String format, Object... args)使用指定的格式字符串和参数返回格式化的字符串。
       }
    }
    public static Node buildTree(){
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
        e.right=h;
        return a;
    }
    //二叉树的前序遍历
    public static void preOrderTraversal(Node root){
        //如何寻找终止条件，肯定是在形参中
        if(root==null){
            return ;
        }
        //根+左子树的前序遍历+右子树的前序遍历
        System.out.print(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    //二叉树的中序遍历
    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        //左子树的中序遍历+根+右子树的中序遍历
        inOrderTraversal(root.left);
        System.out.print(root);
        inOrderTraversal(root.right);
    }
    //二叉树的后序遍历
    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        //左子树的后序遍历+右子树的后序遍历+根
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root);
    }
    private static int count=0;
    public static void getSize(Node root){
        if(root==null){
            return;
        }
        count++;
        getSize(root.left);
        getSize(root.right);
    }
    public static int getSize2(Node root){
        if(root==null){
            return  0;
        }
        int  left=getSize2(root.left);
        int right=getSize2(root.right);
        return 1+left+right;
    }

    public static List<Character>  inOrderList=new ArrayList<>();
    private static void inorderReturnList(Node  root){
        if(root!=null){
            inorderReturnList(root.left);
            inOrderList.add(root.val);
            inorderReturnList(root.right);
        }
    }
    private static List<Character> inoderReturnList2(Node root){
        List<Character>  list=new ArrayList<>();
        if(root==null){
            return list;
        }
        list.addAll(inoderReturnList2(root.left));
        list.add(root.val);
        list.addAll(inoderReturnList2(root.right));
        return list;
    }

    private static int leafSize=0;
    private static void getLeafSize(Node root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            leafSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }
    public static int getLeafSize2(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left=getSize2(root.left);
        int right=getSize2(root.right);
        return left+right;
    }
    public static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.max(left,right)+1;
    }
    //k>=1  k<1，方法无法处理
    public static int getKLevel(Node root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKLevel(root.left,k-1)+getKLevel(root.right,k-1);
    }
    public static Node find(Node  root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        Node n=find(root.left,val);
        if(n!=null){
            return n;
        }
        n=find(root.right,val);
        if(n!=null){
            return n;
        }
        return null;
    }

    public static boolean find2(Node root,int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        if (find2(root.left, val)) {
            return true;
        }
        return find2(root.right, val);
    }

    public  static boolean find3(Node root,int val){
        return  root!=null&&(root.val==val||find3(root.left,val)||find3(root.right,val));
    }

    public static List<Character> post(Node root){
        List<Character> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        List<Character>  left=post(root.left);
        List<Character>  right=post(root.right);
        result.addAll(left);
        result.addAll(right);
        result.add(root.val);
        return  result;
    }
    public static boolean isSameTree(Node p,Node q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null){
            return false;
        }
        if(q==null){
            return false;
        }
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    public static void main(String[] args) {
       Node root= buildTree();
        System.out.print("前序遍历：");
        preOrderTraversal(root);
        System.out.print("中序遍历：");
       inOrderTraversal(root);
        System.out.print("后序遍历：");
        postOrderTraversal(root);
    }
}
