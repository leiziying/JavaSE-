import  java.util.Arrays;
import  java.util.TreeSet;
public class Solution {
    public  static  class  TreeNode{
        int val;
        int left;
        int right;
        TreeNode(int  x){
            val=x;
        }
    }
    //根据前序和中序还原二叉树
    public TreeNode  buildTree(int[]  preorder,int[]  inorder ) {
        //终止条件
        if(preorder.length==0){
            return  null;
        }
        int rootValue=preorder[0];
        int leftCount;
        for(leftCount=0;leftCount<inorder.length;leftCount++){
            if(inorder[leftCount]==rootValue){
                break;
            }
        }
        TreeNode  root =new TreeNode(rootValue);
        int[]  leftPreorder=Arrays.copyOfRange(preorder,1,1+leftCount);
        int[]  leftInorder=Arrays.copyOfRange(inorder,0,leftCount);
        root.left=buildTree(leftPreorder,leftInorder);
        int[]  rightPreorder=Arrays.copyOfRange(preorder,1+leftCount,leftPreorder.length);
        int[]  rightInorder=Arrays.copyOfRange(inorder,leftCount+1,inorder.length);
        root.right=buildTree(rightPreorder,rightInorder);
        return root;
    }
}
