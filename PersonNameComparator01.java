package demo;

import java.util.Comparator;

public class PersonNameComparator01 implements Comparator<Person02> {
    @Override
    public int compare(Person02 o1, Person02 o2) {
        return o1.name.compareTo(o2.name);
    }
}
