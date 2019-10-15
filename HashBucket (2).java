public class HashBucket {
    //定义节点类
    private static class Node{
        private int key;
        private int value;
        Node next;
        //节点类的构造方法
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private Node[]  array;
    private int size;//当前的数据个数
    private  static final  double LOAD_FACTOR=0.75;
    //放数据
    public  int put(int key,int value){
        //key=>int
        //int合法下标
        int  index=key%array.length;
        //在链表中查找key所在的结点
        //如果找到了，更新
        //所有的结点都不是key,插入一个新的节点
        for(Node cur=array[index];cur!=null;cur=cur.next){
            if(key==cur.key){
                int oldValue=cur.value;
                cur.value=value;
                return oldValue;
            }
        }
        Node node=new Node(key,value);
        node.next=array[index];
        array[index]=node;
        size++;
        if(loadFactor()>=LOAD_FACTOR){
            resize();
        }
        return -1;
    }
    public void resize(){
        Node[]  newArray=new Node[array.length*2];
        for(int i=0;i<array.length;i++){
            Node  next;
            for(Node cur=array[i];cur!=null;cur=next){
                next=cur.next;
                int index=cur.key%newArray.length;
                cur.next=newArray[index];
                newArray[index]=cur;
            }
        }
        array=newArray;
    }
    private double loadFactor() {
        return size*1.0/array.length;
    }
    public HashBucket(){
        array=new Node[8];
        size=0;
    }

}
