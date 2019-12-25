/*
 * 	简单模拟一下队列
 */

class ArrayQueueDemo {
	private int maxSize;	//表示数组的最大容量
	private int front;	//队列头
	private int rear;	//队列尾
	private int[] arr;	//用于存放数据
	
	public ArrayQueueDemo(int arrMaxSize) {
		maxSize=arrMaxSize;
		arr=new int[maxSize];
		front=-1;	//指向队列头部,分析出front是指向队列头的前一个位置
		rear=-1;	//指向队列尾部(即包含队列的最后一个数据).
		
	}
	
	public boolean isFull() {
		return rear == maxSize-1;
	}
	
	public boolean isEmpty() {
		return rear==front;
	}
	
	public void addQueue(int n) {
		//判断队列是否满
		if(isFull()) {
			System.out.println("队列满,不能加入数据");
			return ;
		}
		rear++;	//让rear后移
		arr[rear]=n;
	}
	
	public int getQueue() {
		//判断队列是否空
		if(isEmpty())
			throw new RuntimeException("队列为空");
			//通过抛出异常处理;因为如果用-1或0等其他值代表队列为空,可能会被误认为是原本的数值.
		front++;	//front后移
		return arr[front];	
	}
	
	public void showQueue() {
		if(isEmpty()) {
			System.out.println("队列为空");
			return;
		}
		for(int i=0;i<arr.length;i++)
			System.out.printf("arr[%d]=%d\n",arr[i]);
	}
	
}
