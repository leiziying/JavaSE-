package demo;

public class BinarySearchTree {
    public  static class Node{
      int key;
      Node left;
      Node right;

        public Node(int key) {
            this.key = key;
        }
    }
    private Node root=null;
    public   Node search(int key){
        if(root==null){
            System.out.println("空树无法查找");
           return null;
        }
        Node cur=root;
        while(cur!=null){
            if(cur.key==key){
                return cur;
            }else if(cur.key<key){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return null;
    }
}
