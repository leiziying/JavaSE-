/*
篮子里装数，不允许
 */
public class Contact{
    public static  class  Node{
        String name;
        String phone;
        Node left;
        Node right;
        int key;
        int value;
    }
    Node root=null;
    public  Node search(String name){
        Node cur=root;
        while(cur!=null) {
            int r=name.compareTo(cur.name);
            if(r==0){
                return cur;
            }else if(r<0){
                cur=cur.left;
            }else {
                cur=cur.right;
            }
        }
        return null;
    }

    /*
    更新
    1.先查找
    2.再更新
     */
    public String update(String  name,String phone){
        Node cur=root;
        while(cur!=null){
            int r=name.compareTo(cur.name);
            if(r==0){
                String OldPhone=cur.phone;
                cur.phone=phone;
                return OldPhone;
            }else if(r<0){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return null;
    }

    /*
    删除
    删除成功返回true
    删除失败返回false
     */
    public boolean remove(int key){
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.key==key){
                //找到，准备删除
                removeNode(parent,cur);
                return true;
            }else if(cur.key<key){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return false;
    }

    private void removeNode(Node parent, Node cur) {
        //如果待删除节点的left==null
        if(cur.left==null){
            //如果需要删除的节点是根节点
           if(cur==root){
               root=cur.right;
           }
           if(cur==parent.left){
               parent.left=cur.right;
           }
           if(cur==parent.right){
               parent.right=cur.right;
           }
        }
        //如果待删除节点的right==null
        if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }
            if(cur==parent.left){
                parent.left=cur.left;
            }
            if(cur==parent.right){
                parent.right=cur.left;
            }
        }
        //如果待删除节点的left和right都不为空
        if(cur.left!=null&&cur.right!=null){
            Node goat=root.right;
            Node goatParent=goat;
            while(goat.left!=null){
                goatParent=goat;
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

}
