package demo;
//顺序表的元素类型是int类型
public class DemoMyArrayList {
    //顺序表的属性
    //逻辑上类似于数组
    private  int[]   array;//代表的是存在数据的数组
    //array.length代表的是数组的容量
    private  int size;//用来记录顺序表的已有数据个数
    //构造方法
    public  DemoMyArrayList(){
        //申请空间
        array=new int[10];
        //初始化数据个数
        size=0;
    }
    /*
    增（尾插   头插   中间（插入））
    删
    查
    改
     */
    //尾插
    public   void  pushBack(int element){
        ensureCapacity();
        //TODO:先不考虑array数组放不下的问题
        array[size++]=element;
    }
    //删
    public void popBack(){
        if(size<=0){
            System.out.println("顺序表为空");
        }else{
            array[size-1]=0;
            size--;
        }
    }

    //头插
    public void  pushFront(int element){
        ensureCapacity();
        //写伪代码
        //将伪代码翻译成java代码
        /*
        从后往前移
        空心[size,1]
        实心[size-1,0]
        空心代表数据被移到的下标
        实心代表待移动数据的下标
         */
        for(int i=size;i>=1;i--){
            array[i]=array[i-1];
        }
        array[0]=element;
        size++;
    }
    public void  pushIndex(int index,int element){
        ensureCapacity();
        if(index<0||index>size){
            System.out.println("下标错误！");
        }
        for(int i=size;i>=index;i--){
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
    }
//头删  将所有的数据往前移一格（从前往后移）
    public void popFront(){
        if(size<=0){
            System.out.println("顺序表为空");
            return;
        }
        for(int i=0;i<=size-2;i++){
            array[i]=array[i+1];
        }
        array[--size]=0;
    }
//删除下标位置的数
    public void earse(int index){
        if(size<=0){
           System.err.println("顺序表为空");
            return;
        }
        if(index<0||index>=size){
            System.out.println("下标错误");
        }
        for(int i=index+1;i<size;i++){//实心（需要移动的下标）
            array[i-1]=array[i];
        }
        array[--size]=0;
    }
    public void Print(){
        System.out.println("打印顺序表：");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    //保证容量够用,否则进行扩容
    private void ensureCapacity(){
        if(size<array.length){
            return;
        }
        int newCapacity=array.length*2;
        int[] newArray=new int[newCapacity];
        for (int i = 0; i <size ; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public  static void main(String[]   args){
        DemoMyArrayList list=new DemoMyArrayList();
        list.Print();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.Print();
        list.pushFront(10);
        list.pushFront(20);
        list.pushFront(30);
        list.Print();
        list.pushIndex(3,100);
        list.Print();
        list.pushIndex(2,200);//下标错误
        list.Print();
        list.earse(1);
        list.Print();
        list.popFront();
        list.popFront();
        list.popFront();
        list.Print();

    }
}
/*
考虑  数组容量（array.length）和已有数据个数（size）的关系
1.容量是够用的size<array.length
2.插入k个数  size+k<=array.length

容量不够用怎么办
搬家  （1.5/2倍）
     int  newCapacity=array.length*2;
      1)找新家
      int[]  newArray=new int[newCapacity];
      2）搬家    ----> (1.5/2倍)
      for(int  i=0;i<size;i++){
      newArray[i]=array[i];
      }
      3）发朋友圈
      array=newArray;
      4)老房子退掉
         原来的数组对象没有引用指向变成垃圾
   扩容的空间越小，空间浪费越小
   扩容的空间越大，需要扩容的频率越少
   经验值    大概是 1.5倍或者2倍

 */