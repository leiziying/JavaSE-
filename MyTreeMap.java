package demo;

import java.util.HashSet;
import java.util.Set;
//理解Map的背后是如何用搜索树来实现的
public class MyTreeMap {
    //Entry映射关系
    public static class MyEntry{
        private int key;
        private int value;
        private MyEntry left;
        private MyEntry right;

        public MyEntry(int key, int value) {
            this.key=key;
            this.value=value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }
    private MyEntry root=null;
    public int get(int key){
        MyEntry cur=root;
        while(cur!=null){
            if(cur.key==key){
                return cur.value;
            }else if(key<cur.key){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return -1;
    }
//getOrDefault如果有key就返回cur.value如果没找到key就返回默认值Default
    public int getOrDefault(int key,int Default){
        MyEntry cur=root;
        while(cur!=null){
            if(key==cur.key){
                return cur.value;
            }else if(key<cur.key){
                cur=cur.left;
            }else{
                cur=cur.right;
            }
        }
        return Default;
    }

    //如果key存在做更新(返回旧的value)，如果不存在做插入(返回-1)
    public int set(int key,int value){
        if(root==null){
            root=new MyEntry(key,value);
            return -1;
        }
        MyEntry cur=root;
        MyEntry parent=null;
        while(cur!=null){
            if(key==cur.key){
                int oldVale=cur.value;
                cur.value=value;
                return oldVale;
            }else if(key<cur.key){
                parent=cur;
                cur=cur.left;
            }else{
                parent=cur;
                cur=cur.right;
            }
        }
        if(cur==parent.left){
            parent.left=new MyEntry(key,value);
        }else{
            parent.right=new MyEntry(key,value);
        }
        return -1;
    }

    public Set<Integer> keySet() {
        //前序，中序，后序
        //层序
        //中序最好中序是有序的
        return  inOrderKeySet(root);
    }
        private static  Set<Integer> inOrderKeySet(MyEntry node){
        Set<Integer>  set=new HashSet<>();
        //合并子问题  先左再根再右
            if(node!=null){
                Set<Integer>  left=inOrderKeySet(node.left);
                Set<Integer>  right=inOrderKeySet(node.right);
                set.addAll(left);
                set.add(node.key);
                set.addAll(right);
            }
            return set;
        }
}

