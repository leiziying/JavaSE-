import java.util.ArrayList;
import java.util.LinkedList;

class Person{
    public String name;
    public int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class Main1101 {
    public static void main(String[] args) {
        ArrayList<Person>  arrayList=new ArrayList<>();
        arrayList.add(new Person("A",7));
        arrayList.add(new Person("B",9));
        arrayList.add(new Person("C",19));
        arrayList.add(new Person("D",10));
        for (int i = 0; i <arrayList.size() ; i++) {
            Person p=arrayList.get(i);
            System.out.println(p.name+":"+p.age);
        }
        for(Person p:arrayList){
            System.out.println(p.name+":"+p.age);
        }
        LinkedList<Person>  linkedList=new LinkedList<>();
        linkedList.add(new Person("A",1));
        linkedList.add(new Person("B",2));
        linkedList.add(new Person("C",3));
        linkedList.add(new Person("D",4));
        for(Person p:linkedList){
            System.out.println(p.name+":"+p.age);
        }

    }
}
