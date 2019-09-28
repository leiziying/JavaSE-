import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
//排序方法的抽象
interface SortMethod{
	/*
	*@return 排序方法名称
	*/
	String getName();
	/**
	*排序 a
	*@param a
	*/
	void sort(int[] a);
}
//构建原始数组的方法的抽象
interface  BuildMethod{
	/**
	*@return 返回构建方法名称
	*/
	String  getName();
	/**
	*构建数组
	*@param n数组的大小
	*@return 构建好的数组
	*/
	int[]  build(int n);
}
class InsertSortMethod implements  SortMethod{
	@Override
	public String getName(){
		return "插入排序";
	}
	@Override
	public void sort(int[] a){
		Sort.insertSort(a);
	}
}
class ShellSortMethod implements  SortMethod{
	@Override
	public String getName(){
		return "希尔排序";
	}
	@Override
	public void sort(int[] a){
		Sort.shellSort(a);
	}
}

class BuildRandomMethod  implements BuildMethod{
	@Override
	public  String getName(){
		return "构建随机数组";
	}
	@Override
	public int[] build(int n){
		return Lab.buildRandom(n);
	}
}

class BuildSortedMethod implements BuildMethod{
	@Override
	public String getName(){
		return "构建有序数组";
	}
	@Override
	public int[] build(int n){
		return Lad.buildSorted(n);
	}
}

public static Lab{
	public  static int[] buildRandom(int  n){
		Random  random=new Random(201909924);
		int[] r=new  int[n];
		for(int i=0;i<n;i++){
			r[i]=random.nextInt(n);
		}
		return r;
	}
	public  static int[] buildSorted(int n){
		Random random=new Random(20190924);
		int[] r=new int[n];
		for(int i=0;i<n;i++){
			r[i]=random.nextInt(n);
		}
		Arrays.sort(r);
		return r;
	}
	
	private static void shellSortR(int[] array){
		int gap=array.length;
		while(true){
			gap=(gap/3)+1;
			//gap=gap/2;
			insertSortWithGapR(array,gap);
			if(gap==1){
				break;
			}
		}
	}
	
	private static void insertSortWithGapR(int[]  array,int gap){
		for(int i=gap;i<array.length;i++){
			int key=array[i];
			int j;
			for(j=i-gap;j>=0&&array[j]<key;j-=gap){
				array[j+gap]=array[j];
			}
			array[j+gap]=key;
		}
	}
	public  static  int[] buildReversed(int n){
		Random random=new Random(20190924);
		int[] r=new int[n];
		for(int i=0;i<n;i++){
			r[i]=random.nextInt(n);
		}
		shellSortR(r);
		return r;
	}
	public static int[] buildEquals(int n){
		return new int[n];
	}
	
	public static  void main(String[] args){
		BuildMethod[]  bms={new BuildMethod(),new BuildSortedMethod()};
		SortMethod[]   sms={new InsertSortMethod(),new ShellSortMethod()};
	for(int i=1;i<=4;i++){
		int n=50000*i;
		for(BuildMethod  bm:bms){
			int[] a=bm:build(n);
			for(SortMethod  sm:sms){
				int[] b=a.clone();
				long begin=System.nanoTime();
				sm.sort(b);
				long end=System.nanoTime();
				double ms=(end-begin)*1.0/1000/1000;
				System.out.printf("%d:%s:%s:%.4f%n",n,bm.getName(),sm.getName(),ms);
			}
		}
	}
	}
	/*
	public static void  main(String[]  args){
		for(int i=1;i<=4;i++){
			int n=i*50000;
			int[] random=buildRandom(n);
			int[] sorted=buildSorted(n);
			int[] reversed=buildReversed(n);
			int[] equals=buildEquals(n);
			for(SortMethod  method:methods){
				int[]  a=random.clone();
				long begin=System.nanoTime();
				method.sort(a);
				long end=System.nanoTime();
				double ms=(end-begin)*1.0/1000000;
				System.out.printf("随机情况下：%s：耗时%.5f毫秒%n",method.getName(),ms);
			}
		}
	}
	*/
}