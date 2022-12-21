package assignment;

import java.io.IOException;
import java.lang.invoke.StringConcatFactory;

public class deleteByKiteColor
{

	public static void main(String[] args) {
		kite k1=new kite("pink", "virat", 18, true);
		kite k2=new kite("yellow", "raina", 03, true);
		kite k3=new kite("Black", "KL", 1, true);
		kite k4=new kite("violet", "ms", 15, true);
		kite k5=new kite("green", "ro", 45, true);
		kite k6=new kite("cyane", "iyer", 7, true);
		
		byColor myLinkedList=new byColor();
		//myLinkedList.show();
		myLinkedList.add(k1);
		myLinkedList.add(k2);
		myLinkedList.add(k3); 
	    myLinkedList.add(k4);
	    myLinkedList.add(k5);
		//myLinkedList.add(k6);
//		

        myLinkedList.show();
        myLinkedList.deleteWithcolor("Black"); 
	    myLinkedList.show();
	}
}
class byColor{
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

	void deleteWithcolor(String colorToDelete) {
		int count=0;
		if(start==null) {
			System.out.println("The list is empty in the delete with length......");
		}
		else {
			//System.out.println("Hii");
			ptr=start;
		while(ptr!=null) {
			 //count=0;
			if(ptr.color==colorToDelete) {
			   // ptr=ptr.next;
				//System.out.println("Deleted the node......");
			if(count==0) {
				System.out.println("Deleted starting node......");
				start=ptr.next;
			}
			else if(count!=0) {
				pre.next=ptr.next;
				//200n=400
			}
			}
			count++;
			pre=ptr;
			ptr=ptr.next;
			
		}
		
		
	}
}
}

