import java.util.Map;
import java.util.TreeMap;

public class Contact02 {
    Map<String,User02> map=new TreeMap<>();
    public void add(String name,String mobliePhone,String officePhone) throws  NameExistException02{
        User02 user02=new User02(name,mobliePhone,officePhone);
        if(map.containsKey(name)){
            throw  new NameExistException02();
        }
        map.put(name,user02);
    }
}
