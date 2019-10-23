
    /*Object类的equals方法默认比较的是两个对象的地址值，没有意义
      所以我们要重写equals方法，比较两个对象的属性（name,age）

       */
    public  class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public static void main(String[] args) {
            Person p1 = new Person("古力娜扎", 18);
            Person p2 = new Person("迪丽热巴", 20);
            boolean c = p1.equals(p2);
            System.out.println(c);
        }

        @Override
        public boolean equals(Object obj) {
            //增加一个判断，如果传递的参数就是this本身，直接返回true,也可以提高程序效率
            if(obj==this){
                return true;
            }
            //增加一个判断，传递的参数为null，直接返回false，可以提高程序的效率
            if(obj==null){
                return false;
            }
            //增加一个判断，防止类型转换异常ClassCastException
            if (obj instanceof Person) {
                //使用向下转型，把obj转换为Person类型
                Person p = (Person) obj;
                //p1.equals(p2);
                //比较两个对象的属性，一个对象是this（p1)一个对象是p(obj-->p2)
                boolean b = this.name.equals(p.name)&&this.age==p.age;
                return b;
            }
            return false;
        }
    }



