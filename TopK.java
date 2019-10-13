package demo;

import java.util.*;

public class TopK {
    public static Map<String,Integer>  calcCount(String[]  words){//记录每个单词出现的次数，传入参数是字符串数组
        Map<String,Integer>  map=new HashMap<>();//定义一个类型为Map参数分别是String和Integer的集合用HashMap来实现
        for(String w:words){//遍历字符串数组
            int  count=map.getOrDefault(w,0);//在map中找w，如果找到返回w对应的key,否则返回默认值0
            map.put(w,count+1);//向map放入字符串w和w所对应的key
        }
          return map;//返回这个有映射关系的map
    }

    public  static  Map<Integer, List<String>>  calcCountOfWords(Map<String,Integer> map){
        //前面放出现的次数，后面放该次数对应的字符串
        Map<Integer,List<String>>  ret=new HashMap<>();
        for(Map.Entry<String,Integer> e:map.entrySet()){
            String  word=e.getKey();
            int count=e.getValue();
            if(!ret.containsKey(count)){
                ret.put(count,new ArrayList<>());
            }
            ret.get(count).add(word);
        }
        return ret;
    }

    private  static  class IntegerComparator implements Comparator<Integer>{
          //Integer引用类型的比较
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    }

    public static void main(String[] args) {
        String[] words={"the","day","is","sunny","is","the","the","the","sunny","is","is"};
        Map<String,Integer>  wordCount=calcCount(words);
        System.out.println(wordCount);
        Map<Integer,List<String>> countToWordList=calcCountOfWords(wordCount);
        System.out.println(countToWordList);
        Set<Integer> counts=countToWordList.keySet();
        System.out.println(counts);
        List<Integer>  countsList=new ArrayList<>(counts);
        Collections.sort(countsList,new IntegerComparator());
        Collections.sort(countsList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(countsList);
    }
}
