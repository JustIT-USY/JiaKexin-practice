package queue;

public class CircleArrayQueue2 {

	public static void main(String[] args) {
		Queue q=new Queue(4);
		q.add(2);
		q.add(3);
		q.add(5);
		q.showQueue();
		q.get();

		q.showQueue();
		q.add(7);
		q.showQueue();

		q.add(8);
		q.showQueue();
		
		q.get();
		q.showQueue();
		
		q.add(7);
		q.showQueue();
		
		q.add(5);
		q.showQueue();
		
		q.get();
		q.add(100);
		q.showQueue();
	}

}

class Queue{
	private int[] arr;
	private int maxSize;
	private int head=0;
	private int rear=-1;
	private int len;
	
	public Queue(int length) {
		maxSize=length;
		arr=new int[maxSize];
	}
	
	public boolean add(int data) {
		if(len<maxSize) {
			len++;
			rear=(rear+1)%maxSize;
			arr[rear]=data;
			return true;
		}
		return false;
	}
	
	public int get() {
		if(len==0)
			throw new RuntimeException("队列为空!");
		len--;
		int temp=arr[head];
		arr[head]=0;
		head=(head+1)%maxSize;
		return temp;
	}
	
	public void showQueue() {
		int i=0;
		for(int a:arr)
			System.out.printf("arr[%d]=%d\t",i++,a);
		System.out.println();
	}
	
	
}
