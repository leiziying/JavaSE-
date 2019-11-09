public class Synchronized {
    public  void method() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
    public synchronized static void staticMethod(){

    }
    public void blockMethod(){
        synchronized (this){

        }
    }
    private static  class  MyThread extends  Thread{
        private  Synchronized object;
        MyThread(Synchronized object){
            this.object=object;
        }
        @Override
        public void run(){
            while(true){
                object.method();
            }
        }
    }

    public static void main(String[] args) {
        Synchronized object=new Synchronized();
        Thread t=new MyThread(object);
        t.start();
        while(true){
            object.method();
        }
    }
}
