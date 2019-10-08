public class BinarySearchTree {
    class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
        }
    }

        private Node root=null;
        public  Node search(int key){
            Node cur=root;
            while(cur!=null){
                if(key==cur.key){
                    return cur;
                }else if(key<cur.key){
                    cur=cur.left;
                }else{
                    cur=cur.right;
                }
            }
            return null;
        }

        /*
        插入节点
         */

        public  boolean  insert(int key) {
            if(root==null){
                root=new Node(key);
                return true;
            }
           Node cur=root;
            Node parent=null;
            while(cur!=null){
                if(key==cur.key){
                    return false;
                }else if(key<cur.key){
                    parent=cur;
                    cur=cur.left;
                }else{
                    parent=cur;
                    cur=cur.right;
                }
            }
          if(key>parent.key) {
              parent.right=new Node(key);
          }else{
              parent.right=new Node(key);
          }
          return true;
        }
    }

