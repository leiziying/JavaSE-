堆-动态找内存
优先级队列：
1.出队列
2.入队列
3.队首元素
public static  void  shiftUpSmall(int[]  array,int i){
	//直到i=0之前，一直
	//找到i的双亲下标
	//比较array[parent]和array[i]
	//如果满足条件，调整结束
	//否则，交换，然后让i=parent继续
		while(i!=0){
			int p=(i-1)/2;
			if(array[p]<array[i]){
				break;
			}
			swap(array,p,i);
			i=p;
		}
}