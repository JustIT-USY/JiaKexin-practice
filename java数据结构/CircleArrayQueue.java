public class CircleArrayQueue {

	public static void main(String[] args) {
		
		
		
	}

}

class ArrayQueue{
	private int maxSize;
	private int[] arr;
	private int front=0;
	private int rear=0;
	
	public ArrayQueue(int length) {
		maxSize=length;
		arr=new int[length];
		
	}
	
	public void addQueue(int data) {
		if(isFull())
			throw new RuntimeException("队列空");
		arr[rear]=data;
		rear=(rear+1)%maxSize;
	}
	
	public int getQueue() {
		if(isFull())
			throw new RuntimeException("队列空");
		int temp=arr[front];
		front=(++front)%maxSize;
		return temp;
	}
	
	public boolean isFull() {
		return (rear+1)==maxSize;
	}
	
	public boolean isEmpty() {
		return rear==front;
	}
	
	public void showQueue() {
		if(isEmpty())
			throw new RuntimeException("队列为空");
		
		for(int i=front;front<size()+i;i++) {
			System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
		}
		
	}
	
	public int size() {
		return (rear+maxSize-front)%maxSize;
		//		+maxSize是为了当rear<front时依然能正常取模.
	}
	
}
