public class RunnableDemo {
    /*
    * 实现Runnable接口创建多线程的好处：
    *  1.避免了单继承的局限性
    *       一个类只能继承一个类（一个人只能有一个亲爹），类继承了Thread类就不能继承其他的类
    *       实现了Runnable接口，还可以继承其他的类，实现其他的接口
    * 2.增强了程序的扩展性，降低了程序的耦合性（解耦）
    *      实现Runnbale接口的方式，把设置线程任务和开启新的线程进行了分离（解耦）
    *      实现类中重写了run方法，用来设置线程任务
    *      创建Thread类对象，调用start方法，用来开启新的线程

    * */
    public static void main(String[] args) {
        //线程的父类是Thread
        //new MyThread().start
        new Thread(){
          //重写run方法，设置线程任务
          public  void run(){
              for (int i = 0; i <20 ; i++) {
                  System.out.println(Thread.currentThread().getName()+"-->"+"比特");
              }
          }
        }.start();
        //线程的接口Runnable
        //RunnableImp r=new RunnbaleImp;//多态
       Runnable r= new  Runnable(){
            @Override
            public void run(){
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"程序员 ");
                }
            }
        };
        new Thread(r).start();
        //简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"西安工程大学");
                }
            }
        }).start();
    }
}
