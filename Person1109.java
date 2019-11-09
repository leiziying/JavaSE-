public class Person1109 {
    private String name;
   public void run(){
       //定义循环，执行20次
       for (int i = 0; i <20; i++) {
           System.out.println(name+"--->"+i);
       }
   }
    public Person1109() {
    }

    public Person1109(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
