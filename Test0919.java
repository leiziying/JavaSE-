import java.util.Arrays;
import java.util.TreeSet;
import java.util.*;
public class Solution {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootValue = preorder[0];
        int leftCount;
        for (leftCount = 0; leftCount < inorder.length; leftCount++) {
            if (inorder[leftCount] == rootValue) {
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, 1 + leftCount);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftCount);
        root.left = buildTree(leftPreorder, leftInorder);
        int[] rightPreorder = Arrays.copyOfRange(preorder, 1 + leftCount, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, leftCount + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);
        return root;
    }

    TreeNode buildTree3(List<Integer> preorder, List<Integer> inorder) {
        if (preorder.isEmpty()) {
            return null;
        }
        int rootValue = preorder.get(0);
        int leftCount = inorder.indexOf(rootValue);
        List<Integer> leftPre = preorder.subList(1, 1 + leftCount);//左子树的前序
        List<Integer> leftIn = inorder.subList(0, leftCount);//左子树的中序
        //创建了左子树
        List<Integer> rightPre = preorder.subList(1 + leftCount, preorder.size());
        List<Integer> rightIn = inorder.subList(leftCount, inorder.size());
        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree3(leftPre, leftIn);
        root.right = buildTree3(rightPre, rightIn);
        return root;
    }
}