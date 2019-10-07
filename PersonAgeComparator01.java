package demo;

import java.util.Comparator;

public class PersonAgeComparator01 implements Comparator<Person02> {
    @Override
    public int compare(Person02 o1, Person02 o2) {
        return o1.age-o2.age;
    }
}
