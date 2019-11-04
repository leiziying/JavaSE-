import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.StubDelegate;
import java.util.Random;

public class ThreadDemo {
    public static void main(String[] args) {
      try {
          Student student = new Student();
          student.regist(-1000);
          System.out.println(student);
      }catch (Exception e){
          System.out.println(e.getMessage());
      }
    }

}
class Student{
    private int id;
    public void regist(int id) throws Exception {//异常的处理，在方法的声明处
        if(id>0){
            this.id=id;
        }else{
         /*   System.out.println("您输入的数据异常");*/
          /*  throw  new RuntimeException("您输入的数据非法");*/
            throw  new Exception("您输入的数据非法");//生成一个异常对象
        }
    }
    }
