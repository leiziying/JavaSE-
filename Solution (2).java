package demo;

import java.util.Set;
import java.util.TreeSet;

//宝石与石头
public class Solution {
    public int intnumJewelsInStones(String J,String S){
        //把所有宝石放到set中
        Set<Character>   jewels=new TreeSet<>();
        for(char j:J.toCharArray()){
            jewels.add(j);
        }
        //遍历所有的石头
        int count=0;
        for(char s:S.toCharArray()){
            if(jewels.contains(s)){
                count++;
            }
        }
        return count;
    }
}

