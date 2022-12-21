package assignment;

import java.io.IOException;
import java.lang.invoke.StringConcatFactory;

public class countOfTheElement
{

	public static void main(String[] args) {
		kite k1=new kite("pink", "virat", 18, true);
		kite k2=new kite("yellow", "raina", 03, true);
		kite k3=new kite("Black", "KL", 1, true);
		kite k4=new kite("violet", "ms", 15, true);
		kite k5=new kite("green", "ro", 45, true);
		kite k6=new kite("cyane", "iyer", 7, true);
		
		myLinkedListContainer myLinkedList=new myLinkedListContainer();
		//myLinkedList.show();
		myLinkedList.add(k1);
		myLinkedList.add(k2);
		myLinkedList.add(k3); 
	    myLinkedList.add(k4);
	    myLinkedList.add(k5);
		//myLinkedList.add(k6);
//		

        myLinkedList.show();
	    myLinkedList.add(k6);///adding at last
	    myLinkedList.show();
	}
}
class myLinkedList1{
	kite start;
	kite ptr;
	kite pre;
	
	void add(kite newKite) {
		if(start==null) {
			System.out.println("adding first node .......");
			start=newKite;
			//start.next=null;//optional
		}
		else {
			ptr=start;
			while(ptr!=null) {
				System.out.println("Loking fro next node is null is not .....");
				pre=ptr;
				ptr=ptr.next;
			}
			pre.next=newKite;
			newKite.next=null;
		}
		System.out.println();
	}
	void show() {
		int count=0;
		if(start==null) {
			System.out.println(" inside show List is empty ");
			System.out.println("The count of the Kites is "+count);
		}
		else {
			ptr=start;
			System.out.println("List  is not empty ");
			while(ptr!=null) {
		    count++;
			System.out.println(ptr);
			ptr=ptr.next;
		}
			System.out.println("The count of the kites is "+count);
	}
	}
	void searchByLength(int lengthToFound) {
		if(start==null) {
			System.out.println("The list is empty ........");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.length==lengthToFound) {
					System.out.println("\nKite of the length is found "+ptr);
					
				}
				ptr=ptr.next;
			}
		}
	}
	
	

}
	


