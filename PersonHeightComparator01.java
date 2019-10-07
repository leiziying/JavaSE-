package demo;

import java.util.Comparator;

public class PersonHeightComparator01 implements Comparator<Person02> {
    @Override
    public int compare(Person02 o1, Person02 o2) {
        int r=(int)((o1.height-o2.height)*100);
        if(r>0){
            return 1;
        }else if(r==0) {
            return 0;
        }else{
            return -1;
        }
    }
}
