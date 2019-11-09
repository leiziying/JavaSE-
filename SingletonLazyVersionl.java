
public class SingletonLazyVersionl {
    private SingletonLazyVersionl(){}
    private  static  SingletonLazyVersionl instance=null;
    public static SingletonLazyVersionl getInstance(){
        //原子开始
        if(instance==null){
            instance=new SingletonLazyVersionl();
        }
        return instance;
    }
}
