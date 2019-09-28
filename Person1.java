

    public class Person1 implements Comparable<Person1> {
        public String name;
        public int age;
        public int height;
        public int gender;
        @Override
        public int compareTo(Person1 o) {
            if (age < o.age) {
                return -1;
            } else if (age == o.age) {
                return 0;
            } else {
                return 1;
            }
        }

        public static void main(String[] args) {
            Person1 p = new Person1();
            p.name = "Rose";p.age = 18;
            Person1 q=new Person1();
            q.name="Tom";q.age=20;
            int r=p.compareTo(q);
            if(r==-1){
                System.out.println("p比q小");
            }else  if(r==0){
                System.out.println("p等于q");
            }else{
                System.out.println("p大于q");
            }

        }
    }

