import java.util.LinkedList;
import java.util.Queue;
//层序遍历
public class Demo0922 {
    public  class Node{
        char val;
        Node left=null;
        Node right=null;
        Node(char val){
            this.val=val;
        }
    }
    public static void levelOrder(Node  root ){
        if(root==null){//当root不为空额的情况下才需要层序遍历
            return ;
        }
        Queue<Node>  queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node  front=queue.poll();
            System.out.println(front.val);
            if(front.left!=null){
                queue.offer(front.left);
            }
            if(front.right!=null){
                queue.offer(front.right);
            }
        }
    }
	import java.util.Stack;
public   class Demo0922{
    public class Node{
        char val;
        Node left=null;
        Node right=null;
        Node(char val){
            this.val=val;
        }
    }
	//非递归实现二叉树的前中后序遍历
    public static void preorder(Node  root){
      Stack<Node>  stack=new Stack<>();
      Node cur=root;
      while(cur!=null||!stack.isEmpty()){
          while(cur!=null){
              System.out.println(cur.val);
              stack.push(cur);
              cur=cur.left;
          }
          Node top=stack.pop();
          cur=top.right;
      }
    }
    public static void inorder(Node root){
        Stack<Node> stack =new Stack<>();
        Node cur=root;
        Node last=null;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                System.out.println();
                cur=cur.left;
            }
            Node top=stack.pop();
            cur=top.right;
        }
    }
    public  static void postorder(Node root){
        Stack<Node>  stack=new Stack<>();
        Node cur=root;
        Node last=null;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.peek();
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
    //非递归的前序遍历
    public List<Integer> preorderTraversal(Node root){
     List<Integer>  list=new ArrayList<>();
     Stack<Node>  stack=new Stack<>();
     Node cur=root;
     while(cur!=null||stack.isEmpty()){
         while(cur!=null){
             //打印
             list.add(cur.val);
             //入栈
             stack.push(cur);
             cur=cur.left;
         }
        Node top=stack.pop();
         cur=top.right;
     }
     return list;
    }
    //非递归的中序遍历
    public List<Integer>  inorder(Node root){
        List<Integer>  list=new ArrayList<>();
        Stack<Node>  stack=new Stack<>();
        Node cur=root;
        while(cur!=null||stack.isEmpty()){
            while(cur!=null){
                //先入栈
                stack.push(cur);
                //打印
                list.add(cur.val);
                cur=cur.left;
            }
            Node top=stack.pop();
            cur=top.right;
        }
        return list;
    }
}
/*
二叉树
  前中后序    栈的影子
    递归+非递归
*/