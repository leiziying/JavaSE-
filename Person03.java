package demo2;

import java.util.Comparator;


 class PersonNameComparator03 implements Comparator<Person03>{

    @Override
    public int compare(Person03 o1, Person03 o2) {
        return o1.name.compareTo(o2.name);
    }
}

 class  PersonHeightComparator03 implements Comparator<Person03>{

    @Override
    public int compare(Person03 o1, Person03 o2) {
        return (int)((o1.height-o2.height)*100);
    }
}

 class ComplexComparator03 implements  Comparator<Person03>{

    @Override
    public int compare(Person03 o1, Person03 o2) {
        if(o1.height-o2.height>0){
            return 1;
        }else if(o1.height-o2.height<0){
            return -1;
        }
        if(o1.weight-o2.weight>0){
            return 1;
        }else if(o1.weight-o2.weight<0){
            return -1;
        }
        int r=o1.name.compareTo(o2.name);
        if(r!=0){
            return r;
        }
        return o1.age-o2.age;
    }
}
public class Person03 implements  Comparable <Person03>{
    public String name;
    public int age;
    public double height;
    public double weight;
    public String gender;
    @Override
    public int compareTo(Person03 o) {
        return age-o.age;
    }

    public static void main(String[] args) {
        Person03 p=new Person03();
        p.name="Rose";p.age=23;p.height=1.56;p.weight=45;
        Person03 q=new Person03();
        q.name="Jack";q.age=34;q.height=1.78;q.weight=56;
        Comparator<Person03>  comparator=new PersonNameComparator03();
        System.out.println("按姓名比较：");
        int s=comparator.compare(p,q);
        if(s<0){
            System.out.println("p小于q");
        }else if(s==0){
            System.out.println("p等于q");
        }else {
            System.out.println("p大于q");
        }

        Comparator<Person03>  comparator1=new PersonHeightComparator03();
        int r=comparator.compare(p,q);
        if(r<0){
            System.out.println("p小于q");
        }else if(r==0){
            System.out.println("p等于q");
        }else{
            System.out.println("p大于q");
        }

    }
}
