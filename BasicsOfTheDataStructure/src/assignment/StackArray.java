package assignment;

public class StackArray {
	public static void main(String[] args) {
		MyStack1 StackObj=new MyStack1(3);
		StackObj.push(10);
		StackObj.push(20);
		StackObj.push(30);
		StackObj.push(35);
		System.out.println(StackObj.pop());
		StackObj.pop();
		System.out.println(StackObj.pop()+"index "+StackObj.index);
		StackObj.pop();
	}
}

class StackOverflowExecption extends RuntimeException{
   StackOverflowExecption(String errorMessage) {
	   super(errorMessage);
	}
}
class StackUnderFlowException extends RuntimeException{
	StackUnderFlowException(String errorMessage) {
		   super(errorMessage);
		}
	}
class MyStack1{
	int index=0;
	int size;
	int arr [];
	MyStack1(int size){
		this.arr=new int[size];
		this.size=size;
	}
	void push(int n) {
		
		if(index > size-1) {
			throw new StackOverflowExecption("The Stack is Full");
		}
		System.out.println("Pushing element on the stack "+n+"index"+index);
		arr[index++]=n;
	}
	int pop() {
		if(index <= 0) {
			throw new StackUnderFlowException("The Stack is Underflow");
		}
		return arr[--index];
	}
	int peek() {
		return arr[--index];
	}
}