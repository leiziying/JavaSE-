public class BinarySearchTree {
    public class  Node{
        int key;
        Node left;
        Node right;
        public Node(int key) {
            this.key = key;
        }
    }
    private Node root=null;
    //查找 找到返回该节点 否则返回null
    public Node search(int key){
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
      return null;//走到这里说明cur==null，要么搜索树中没有找到，要么是空树
    }
    //插入
    /*
    插入成功返回true 否则返回false
    思路：
    先查找   再插入
     */
    public  boolean insert(int key){
        //定义一个parent记录cur的双亲节点，方便后面做插入
        Node parent=null;
        Node cur=root;
        if(root==null){
            root=new Node(key);
            return true;
        }
        while(cur!=null){
            if(cur.key==key){
                //找到  说明重复插入
                return false;
            }else if(cur.key<key){
                parent=cur;
                cur=cur.left;
            }else{
                parent=cur;
                cur=cur.right;
            }
        }
        //走到这里cur==null,说明没有找到所以插入，判断cur的位置
        if(cur==parent.left){
            parent.left=cur;
        }else{
            parent.right=cur;
        }
        return true;
    }

    //删除  成功--true   失败--false
    /*
    思路;先查找  再删除
     */
    public boolean remove(int  key){
        Node parent=null;
        Node cur=root;
        if(root==null){
            System.out.println("空树无法删除");
            return false;
        }
        while(cur!=null){
            if(cur.key==key){
                //找到 准备删除
                removeNode(parent,cur);
                return true;
            }else if(cur.key>key){
                parent=cur;
                cur=cur.left;
            }else{
                parent=cur;
                cur=cur.right;
            }
        }
        return true;
    }
   //删除的方法
    private void removeNode(Node parent, Node cur) {
        if(cur.left==null){
           if(cur==root){
               root=cur.right;
             }else if(cur==parent.left){
               parent.left=cur.right;
           }else{
               parent.right=cur.right;
           }
        }else if(cur.right==null){
            if(cur==parent.left){
                parent.left=cur.left;
            }else{
                parent.right=cur.right;
            }
        }else{
            Node goat=root.right;
            Node goatParent=null;
            while(goat.left!=null){
                parent=goat;
                goat=goat.left;
            }
           cur.key=goat.key;
            if(goat==goatParent.left){
                goatParent.left=goat.right;
            }else{
                goatParent.right=goat.right;
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree =new BinarySearchTree();
        int[]  keys={3,9,7,4,1,6,2,8,5};
        for(int key:keys){
            System.out.println(tree.insert(key));
        }
        System.out.println("插入重复数据");
        System.out.println(tree.insert(7));
        System.out.println("前序遍历");
        preOrder(tree.root);
        System.out.println("中序遍历");
        inOrder(tree.root);
        System.out.println(tree.search(7).key);
        System.out.println(tree.search(8).key);
        System.out.println(tree.search(5).key);
        System.out.println(tree.search(5).key);
    }

    private static void preOrder(Node node) {
        if(node!=null){
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    private static void inOrder(Node node) {
        if(node!=null){
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);
        }
    }


}

