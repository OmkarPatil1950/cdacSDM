package LinkedList;

import java.util.Scanner;

public class MenuLinkedList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 myLinkedListContainer newList=new myLinkedListContainer();
		 
		 System.out.println("Enter the choice.....");
		 int choice=sc.nextInt();
	
	do {
		System.out.println("----Menu------");
		System.out.println("1.Add at first...");
		System.out.println("2.Add at last...");
		System.out.println("3.Insert in between...");
		System.out.println("4.Delete the first...");
		System.out.println("5.Delete the last...");
		System.out.println("6.serch at last...");
		System.out.println("7.delete with the length...");
		System.out.println("8.exit...");
		}while(choice==8);

	switch(choice) {
	case 1:{
		newList.addAtBegining(new kite("pink", "virat", 18, true));
		break;
	}
	
	}
}
}