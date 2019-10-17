import java.util.*;

/*
"900  google.mail.com"      google.mail.com  900
"50 yahoo.com"              mail.com         900
                            com              900+50
"5  wiki.org"
 */
public class StringDemo {
    public static void main(String[] args) {
        Map<String,Integer>  map=new TreeMap<>();
        String[]  cpdomains={"900  google.mail.com","50 yahoo","5 wiki.org"};
        //google.mail.com
        //mail.com
        //com
       for(String cpdomain:  cpdomains){
          String[] a=cpdomain.split(" ");
          int n=Integer.valueOf(a[0]);
          String domain=a[1];
           String[] b=domain.split("\\.");
           for(int  i=0;i<b.length;i++){
               String[] c= Arrays.copyOfRange(b,i,b.length);
               String subdomainI=String.join(".",c);
               Integer oldCount=map.getOrDefault(subdomainI,0);
                       map.put(subdomainI,oldCount+n);
           }
       }
        System.out.println(map);
       List<String> ret=new ArrayList<>();
       for(Map.Entry<String,Integer> e:map.entrySet()){
           String domain=e.getKey();
           int n=e.getValue();
           String s=String.format("%d %s",n,domain);
           ret.add(s);
       }
    }
}
