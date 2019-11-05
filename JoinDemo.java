public class JoinDemo {
    /*private enum Week{
        MON,TUE,WED,THU,FRI,SAT,SUN
    }*/
    /*public static void main(String[] args) {
        for (Week week : Week.values()) {
            System.out.println(week);
        }
    }*/
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getState());
        thread.start();
       while(thread.isAlive()){
           System.out.println(thread.getState());
       }
        System.out.println("==========================");
        System.out.println(thread.getState());
    }
}
