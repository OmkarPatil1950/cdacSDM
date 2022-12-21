package DS.begin;
public class QueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queueObj=new MyQueue(3);
		queueObj.add(10);
		queueObj.add(20);
		queueObj.add(100);
		//queueObj.add(100);
		
		System.out.println(queueObj.remove());
		System.out.println(queueObj.remove());
	//	System.out.println(queueObj.remove());
		System.out.println(queueObj.peek());

	}
}
class MyQueueFullException extends RuntimeException {
	MyQueueFullException(String errMsg){
	super(errMsg);
	}
}
class RemovingFromEmptyQueueException extends RuntimeException{
	RemovingFromEmptyQueueException(String errMsg){
		super(errMsg);
	}
}
class MyQueue{
	int front=0;
	int index=0;
	int length;
	int arr[];
	
	public MyQueue(int length) {
		// TODO Auto-generated constructor stub
		this.length=length;
		this.arr=new int [length];
	}
	void add(int n) {
		//0 1 
		System.out.println("The element is added in the Queue "+n+" at index "+index);
		
		if(index > length) {
			System.out.println("inside if");
			throw new MyQueueFullException("Queue is Full");
		}
		arr[index++]=n;
	}
	int  remove() {
		if(front >length-1) {
			throw new RemovingFromEmptyQueueException("Queue is empty");
		}
		return arr[front++];
	}
	int peek() {
		return arr[--index];
	}
}



