package demo;
import java.util.Comparator;
public class PersonWeightComparator01 implements Comparator<Person02> {
    @Override
    public int compare(Person02 o1, Person02 o2) {
        int w=o1.weight-o2.weight;
        if(w>0){
            return 1;
        }else if(w==0){
            return 0;
        }else{
            return -1;
        }
    }
}
