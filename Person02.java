package demo;

import java.util.Comparator;

public class Person02 implements Comparable<Person02>{
     public String name;
     public  int age;
     public int denger;
     public int height;
     public int weight;
    @Override
    public int compareTo(Person02 o) {
        return age-o.age;
    }
}
