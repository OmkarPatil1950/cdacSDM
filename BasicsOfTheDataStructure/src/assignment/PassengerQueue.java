package assignment;

public class PassengerQueue {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MyQueuePassenger queueObj=new MyQueuePassenger(3);
			queueObj.add("Omkar");
			queueObj.add("Pawan");
			queueObj.add("Sudheeer");
		//	queueObj.add("Abhi");
			
//			System.out.println(queueObj.remove());
//			System.out.println(queueObj.remove());
//			System.out.println(queueObj.remove());
//			System.out.println(queueObj.peek());
//
		}
	}
	class MyQueueFullException1 extends RuntimeException {
		MyQueueFullException1
		(String errMsg){
		super(errMsg);
		}
	}
	class RemovingFromEmptyQueueException1 extends RuntimeException{
		RemovingFromEmptyQueueException1(String errMsg){
			super(errMsg);
		}
	}
	class MyQueuePassenger{
		int front=0;
		int index=0;
		int length;
		String arr[];
		
		public MyQueuePassenger(int length) {
			// TODO Auto-generated constructor stub
			this.length=length;
			this.arr=new String [length];
		}
		void add(String name) {
			//0 1 
			System.out.println("The element is added in the Queue "+name+" at index "+index);
			
			if(index > length) {
				System.out.println("inside if");
				throw new MyQueueFullException1("Queue is Full");
			}
			arr[index++]=name;
		}
		String  remove() {
			if(front >length-1) {
				throw new RemovingFromEmptyQueueException1("Queue is empty");
			}
			return arr[front++];
		}
		String peek() {
			return arr[--index];
		}
	}
