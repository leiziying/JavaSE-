import java.util.Map;
import java.util.TreeMap;

public class CalcCount {
    public static int calcCount(int[] nums){
      Map<Integer,Integer> map=new TreeMap<>();
        for (int n:nums) {
            int c=map.getOrDefault(n,0);
            map.put(n,c+1);
/*            Integer r=map.get(n);
            if(r==null){
                map.put(n,1);
            }else{
                map.put(n,r+1);
            }*/
        }
       for(Map.Entry<Integer,Integer>  e:map.entrySet()){
           int n=e.getKey();
           int c=e.getValue();
           if(c==1){
               return n;
           }
       }
       return -1;
    }
}
