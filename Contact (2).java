import java.util.Map;
import java.util.TreeMap;

public class Contact {
    Map<String ,User>  map=new TreeMap<>();
    public void add(String name,String mobliePhone,String officePhone) throws  NameExistException{
        User  user=new User(name,mobliePhone,officePhone);
        if(map.containsKey(name)){
            throw  new NameExistException();
        }
        map.put(name,user);
    }
}
