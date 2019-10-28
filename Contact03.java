import java.util.Map;
import java.util.TreeMap;

public class Contact03 {
    Map<String,User03>  map=new TreeMap<>();
    public void add(String  name,String mobilePhone,String officePhone)  throws  NameExistException03{
        User03  user03=new User03(name,mobilePhone,officePhone);
        if(map.containsKey(name)){
            throw new NameExistException03();
        }
        map.put(name,user03);
    }
}
