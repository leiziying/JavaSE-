//如何只有前序遍历（带空节点的）创建二叉树
/*
1.无法直接切割为左右子树序列
2.在创建树的过程中，会得到用掉了多少个节点
*/
//返回两个值,创建好树的根节点，用掉的个数，用一个类包起来
public  class Solution9020{
	 private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
	//Build Tree Rturn Value
	private static  class BTRV{
	private	TreeNode root;
	private	int used;//用掉了多少个节点
	}
   BTRV	buildTree(List<Integer>  preorder){
	   if(preorder.size()==0){//574##18##4没有给全
		   BTRV returnValue=new BTRV();
		   returnValue.root=null;
		   returnVAlue.used=0;
		   return returnVAlue;
	   }
	   //找到根的值
	  int rootValue=preorder.get(0);
	  if(rootValue=='#'){
		  BTRV returnValue=new BTRV();
		  returnValue.root=null;
		  returnValue.used=1;
		  return returnValue;  
	  }
	  //传给左子树去创建
	 BTRV leftReturn=buildTree5(preorder.subList(1,preorder.size()));//leftReturn.root  创建好的左子树的根 used是用掉的节点的个数
	 BTRV rightReturn=buildTree5(preorder.subList(1+leftReturn..used,preorder.size()));
	 TreeNode root=new TreeNode(rootValue);
	 root.left=leftReturn.root;
	 root.right=rightReturn.root;
	 //返回最终结果（BTRV类型）
	 BTRV returnValue=new BTRV();
	 returnValue.root=root;
	 returnValue.used=1+leftReturn.used+rightReturn.used;
	 return returnValue;  
   }
}	


//二叉树遍历，先根据前序遍历建立起二叉树，在对二叉树进行中序遍历，输出遍历结果
 import java.util.*;
 public  class BuildTree{
	 private static class Node{
		 private char val;
		private Node left=null;
		private Node right=null;
		private Node(int val){
			 this.val=val;
		 }
	 }
	 private static class Rv{
		 private Node root;
		 private int used;
		 private RV(Node root,int used){
			 this.root=root;
			 this.used=used;
		 }
	 }
	 private static RV buildTree(char[] preorder){
		 if(preorder.length==0){
			 return new RV(null,0);
		 }
		 if(preorder[0]=='#'){
			 return new RV(null,1);
		 }
		Node root=new Node(preorder[0]);
		RV left=buildTree(Arrays.copyOfRange(preorder,1,preorder.length));
		RV right=buildTree(Arrays.copyOfRange(preorder,1+left.used,preorder.length));
		root.left=left.root;
		root.right=right.root;
		return new RV(root,1+left.used+right.used);
	 }
	 //输出中序遍历
	 private static void inorderTraversal(Node root){
		 if(root!=null){
			 inorderTraversal(root.left);
			 System.out.print(root.val+" ");
			 inorderTraversal(root.right);
		 }
	 }
	 public static void main(Stirng[] args){
		 Scanner scanner=new Scanner(System.in);//创建一个读取器
		 String line=scanner.nextLine();
		 char[]  charArray=line.toCharArray();
		 RV rv=buildTree(charArray);
		 inorderTraversal(rv.root);
	 }
 }
 
 //根据二叉树创建字符串，采用前序遍历的方式，讲一个二叉树转换成由一个括号和整数组成的字符串，空节点用一对空()表示
 //根（左子树的前序遍历）（右子树的前序遍历） 没有最外层括号，省略不必要的括号
 //汇总的方式
 //左右都为空       可以省略
 //左不为空右为空   可以省略
 //左为空右不为空,不能省略
 public static String _tree2str(TreeNode t){
	 String s="";
	 if(t!=null){
		 s+="(";
		 s+=t.val;
		 if(t.left==null&&t.right==null){
			 //两个都为空啥都不用写
		 }else if(t.left==null&&t.right!=null){
			 s+="()";
			 s+=_tree2str(t.right);
		 }else if(t.left!=null&&t.right==null){
			 s+=_tree2str(t.left);
		 }else{
		 s+=_tree2str(t.left);
		 s+=_tree2str(t.right);
		 }
		 s+=")";
	 }
	 return s;
 }
 public static String tree2str(TreeNode  t){
	 if(t==null){
		 return null;
	 }
	 String s=_tree2str(t);
	 s.substring(1,s.length()-1);
 }


/*1.层序遍历及其变形题
  2.前中后序的非递归写法
*/
 //层序遍历可以认为是二叉树的广度优先遍历（队列） 
 public  static LevelOrder{
	 private static class Node{
		 char val;
		 Node left;
		 Node right;
		 Node(char val){
			 this.val=val;
		 }
	 }
	 public static void levelOrder(Node root){
		 //基本层序遍历中队列是不为空的
		 if(root==null){
			 return null;
		 }
		 Queue<Node>  queue=new LinkedList<>();//用链表实现队列
		 queue.offer(root);
		 while(!queue.isEmpty()){
			 Node front=queue.poll();//取出队首元素
			 System.out.println(front.val);
			 if(front.left!=null){
				 queue.offer(front.left);//将front的左孩子带到队列中
			 }
			 if(front.right!=null){
				 queue.offer(front.right);//将front的右孩子带到队列中
			 }
		 }
	 }
	 private static class NodeLevel{
		 public Node node;
		 public int level;
		 NodeLevel(Node node,int level){
			 this.node=node;
			 this.level=level;
		 }
	 }
	 public static void levelOrder(Node root){
		 if(root==null){
			 return;
		 }
		 Queue<NodeLevel> queue =new LinkedList<>();
		 queue.offer(new NodeLevel(root,1));
		 while(!queue.isEmpty()){
			 NodeLevel front=queue.poll();
			 System.out.println(front.level+":"+front.node.val);
			if(front.node.left!=null){
				queue.offer(new NodeLevel(front.node.left,front.level+1));
			}
			if(front.node.right!=null){
				queue.offer(new NodeLevel(front.node.right,front.level+1));//层序遍历并且带着层数
			}
		 }
	 }
 }