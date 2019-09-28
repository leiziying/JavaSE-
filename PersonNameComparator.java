import java.util.Comparator;
public class PersonNameComparator implements Comparator<PersonNameComparator.Person2> {
    @Override
    public int compare(Person2 o1, Person2 o2) {
     return    o1.name.compareTo(o2.name);
    }

    public static class Person2{
        public String name;
        public int age;
        public int height;
        public int gender;
    }

    public static void main(String[] args) {
        Person2 p=new Person2();
        Person2  q=new Person2();
        p.name="Tom";
        q.name="Abc";
       PersonNameComparator r=new PersonNameComparator();
       int s=r.compare(p,q);
       if(s>0){
           System.out.println("p大与q");
       }else if(s==0){
           System.out.println("p等于q");
       }else{
           System.out.println("p小于q");
       }
    }
}
