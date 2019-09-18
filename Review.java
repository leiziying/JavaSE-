//交换一次的先前排列
for(int i=A.length-2;i>=0;i--){
	if(A[i]>A[i+1]){
		int maxIndex=-1;
		int max=Integer.MIN_VALUE;
		for(int j=i+1;j<A.length;j++){
			if(A[j]<A[i]&&A[j]>max){
				max=A[j];
				maxIndex=j;
			}
		}
		int t=A[i];
		A[i]=A[maxIndex];
		A[maxIndex]=t;
		return A;
	}
}
//二叉树的最近公共祖先
/*1.p或q就是root
 return root
 2.p和q不在一颗子树上
   return  root
 3.p和q都在左子树上
 4.p和q都在右子树上
 5.一个在左子树上一个在右子树上
 */
 class Solution {
	 private boolean search(TreeNode  r,TreeNode  t){
		 if(r==null){
			 return  false;
		 }
		 if(r==t){
			 return  true;
		 }
		 if(search(r.left,t)){
			 return true;
		 }
		 return search(r.right,t);
	 }
	 public  TreeNode lowestCommonAncestor(TreeNode  root,TreeNode p,TreeNode q){
		 if(p==root||q==root){
			 return root;
		 }
		 boolean pInLeft=search(root.left,p);
		 boolean qInLeft=search(root.left,q);
		 if(pInLeft&&qInLeft){
			 return lowestCommonAncestor(root.left,p,q);
		 }
		 if(!pInLeft&&!qInLeft){
			 return lowestCommonAncestor(root.right,p,q);
		 }
		 return  root;
	 }
 }
TreeNode  biuldTree(int[] inorder,int [] postorder){
	if(postorder.length==0){
		return null;
	}
	int rootValue
}