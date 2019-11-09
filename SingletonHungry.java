public class SingletonHungry {
    //不允许外边调用构造方法
    private SingletonHungry(){};
    private static SingletonHungry instance=new SingletonHungry();
    public static SingletonHungry getInstance(){
        return instance;
    }
}
