package assignment;

import java.util.ArrayList;

public class peek {
	

	public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			ArrayList<Integer> str = new ArrayList<>();
			str.add(1);
			MyStack stackObj = new MyStack(10);
			stackObj.push(10);
			stackObj.push(20);
			stackObj.push(30);
			stackObj.push(40);
			stackObj.push(50);
			stackObj.push(60);
			System.out.println(stackObj.pop());
			System.out.println(stackObj.peek());
		}

	}

	class MyStackOverFlowExceptione extends RuntimeException
	{
		MyStackOverFlowExceptione(String errMsg)
		{
			super(errMsg);
		}
	}

	class MyStackUnderFlowException extends RuntimeException
	{
		MyStackUnderFlowException(String errMsg)
		{
			super(errMsg);
		}
	}

	class MyStack
	{
		int size;
		int index = 0; // 1 2
		int arr[];	   // creating global referance variable of the array
	public
		MyStack(int size)
		{
			// TODO Auto-generated constructor stub
			this.size = size;
			arr = new int[size]; // crerating array  of the size (size)
		}
		void push(int n)
		{
			System.out.println("push the element in the Stack " + n);
			// System.out.println("index : "+index);
			if (index > size - 1)
			{
				throw new MyStackOverFlowExceptione("Stack Overflow");
			}
			arr[index++] = n; // arr[0]=10; [1]=20; [2]=30;
			// index++;//1 2 3
			// System.out.println(arr[index]);
		}
		int pop()
		{
			System.out.println("Poping the element from the stack ");
			if (index < 0)
			{
				throw new MyStackUnderFlowException("Stck Underflow");
			}
			return arr[--index]; // 2
		}
		int peek()
		{
			System.out.println("The peeking topmost element ");
			return arr[--index];
		}
	}