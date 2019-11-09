//线程安全版本的懒汉单例
//缺点：锁的东西的太多了（锁粒度太大了）
public class SingletonLazyVersion2 {
  private SingletonLazyVersion2(){}
  private static SingletonLazyVersion2 instance=null;
  public synchronized static SingletonLazyVersion2 getInstance(){
      if(instance==null){
          instance=new SingletonLazyVersion2();
      }
      return instance;
  }
}
