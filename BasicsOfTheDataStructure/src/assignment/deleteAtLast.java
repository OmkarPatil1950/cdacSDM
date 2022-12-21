package assignment;

import java.io.IOException;
import java.lang.invoke.StringConcatFactory;

public class deleteAtLast
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
        //myLinkedList.deleteObject(k5);
        myLinkedList.deleteOfOwner("raina");
        myLinkedList.show();
	}
}
class delete{
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
	

	void deleteOfOwner(String ownerName) {
		if(start==null) {
			System.out.println("List is empty nothing to delete.......");
		}
		else {
			
			if(start.owner.equals(ownerName)) {
				start.next=start;
			}
			else {
				ptr=start;
				while(ptr!=null) {
					if(ptr.owner.equals(ownerName)) {
						System.out.println("Deleted sucessfullt .....");
						pre.next=ptr.next;
					}
					pre=ptr;
					ptr=ptr.next;
				}
			}
		}
		
	}
	void deleteObject(kite k) {
		if(start==null) {
			System.out.println("List is empty.......");
		}
		else if(start==k)
		{
			start=start.next;
			System.out.println("Deleted the first object....");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr==k) {
					pre.next=ptr.next;
				}
				pre=ptr;
				ptr=ptr.next;
			}
		}
	}
}

