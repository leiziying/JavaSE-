import java.util.*;
public class BinaryTree2{
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
        System.out.println(root);
       inOrderTraversal(root.right);
    }
    public  static  void  postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        //左子树后序遍历+右子树后序遍历+根
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root);
     }
     private  static int  count=0;
    public  static void getSize(Node  root){
        if(root==null){
            return;
        }
        count++;
        getSize(root.left);
        getSize(root.right);
    }
    public  static int  getSize2(Node  root){
        if(root==null){
            return 0;
        }
        int left=getSize2(root.left);
        int  right=getSize2(root.right);
        //汇总（left,right）
        return left+right+1;
    }
    private  static List<Character>  inorderList=new ArrayList<>();//按照前序遍历保存到inorderList中
    private  static void  inorderReturnList(Node root){
        if(root!=null){
            inorderReturnList(root.left);
            inorderList.add(root.val);
            inorderReturnList(root.right);
        }
    }
  private  static  List<Character>   inorderReturnList2(Node  root){
        List<Character>  list=new ArrayList<>();
        if(root==null){
            return list;
        }
        list.addAll(inorderReturnList2(root.left));
        list.add(root.val);
        list.addAll(inorderReturnList2(root.right));
        return list;
  }
  private  static  int leafSize=0;
       private static void  getLeafSize(Node  root){
        //计算叶子节点个数
      if(root==null){
          return;
      }
      if(root.left==null&&root.right==null){
          leafSize++;
      }
      getLeafSize(root.left);
      getLeafSize(root.right);
  }
  public  static int getLeafSize2(Node  root){
           if(root==null){
               return 0;
           }
           if(root.left==null&&root.right==null){
               return 1;
           }
           int left=getLeafSize2(root.left);
           int right=getLeafSize2(root.right);
           return left+right;
  }
  public  static  int getHeight(Node  root){
           if(root==null){
               return 0;
           }
           int left=getHeight(root.left);
           int right=getHeight(root.right);
           return Math.max(left,right)+1;
  }
  //k>=1,如果看k<1,方法无法处理
    public static  int getKLevel(Node  root,int k){
           if(root==null){
               return 0;
           }
           if(k==1){
               return 1;
           }
           return  getKLevel(root.left,k-1)+getKLevel(root.right,k-1);
    }
    public  static Node  find(Node  root,int val){
           if(root==null){
               return null;
           }
           if(root.val==val){
               return root;
           }
           Node  n=find(root.left,val);
           if(n!=null){
               return  n;
           }
           n=find(root.right,val);
           if(n!=null){
               return n;
           }
           return null;
    }
    public  static  boolean  find2(Node  root,int val){
           if(root==null){
               return false;
           }
           if(root.val==val){
               return  true;
           }
           if(find2(root.left,val)){
               return true;
           }
          return find2(root.right,val);
    }
    public  static boolean find3(Node root,int  val){
           return  root!=null&&(root.val==val||find3(root.left,val));
    }
}