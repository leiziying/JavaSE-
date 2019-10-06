package demo;

import java.util.Comparator;

class  PersonNameComparator implements Comparator<Person01>{
    @Override
    public int compare(Person01 o1, Person01 o2) {
        return o1.name.compareTo(o2.name);
    }
}
class PersonHeightComparator implements Comparator<Person01>{

    @Override
    public int compare(Person01 o1, Person01 o2) {
        return (int)((o1.height-o2.height)*100);
    }
}

class ComplexComparator implements Comparator<Person01>{

    @Override
    public int compare(Person01 o1, Person01 o2) {
        if(o1.height<o2.height){
            return -1;
        }else if(o1.height>o2.height){
            return 1;
        }
        if(o1.weight<o2.weight){
            return -1;
        }else if(o1.weight>o2.weight){
            return 1;
        }
        int r=o1.name.compareTo(o2.name);
        if(r!=0){
        return r;
        }
        return o1.age-o2.age;
    }
}
public class Person01 implements Comparable<Person01> {
    public String name;
    public int age;
    public double  height;
    public int weight;
    public int level;
    public int gender;
    @Override
    public int compareTo(Person01 o) {
        return age-o.age;
       /*
       if(age<o.age){
       return -1;
       }else if(age==o.age){
          return 0;
       }else{
       return -1;
       }
        */
    }

    public static void main(String[] args) {
        Person01 p=new Person01();
        p.name="Alence";p.age=18;p.weight=56;p.height=1.80;
        Person01 q=new Person01();
        q.name="Peter";q.age=20;q.weight=45;q.height=1.87;
        int r=p.compareTo(q);
        if(r<0){
            System.out.println("p小与q");
        }else if(r==0){
            System.out.println("p等于q");
        }else{
            System.out.println("p大于q");
        }
       Comparator<Person01>  comparator=new PersonNameComparator();
        System.out.println("按姓名比较：");
       int s=comparator.compare(p,q);
       if(s<0){
           System.out.println("p小与q");
       }else if(s==0){
           System.out.println("p等于q");
       }else{
           System.out.println("p大于q");
       }

       Comparator<Person01> comparator1=new PersonHeightComparator();
        System.out.println("按身高比较：");
       int s2=comparator.compare(p,q);
       if(s2<0){
           System.out.println("p小于q");
       }else if(s2==0){
           System.out.println("p等于q");
       }else{
           System.out.println("p大于q");
       }

    }
}
