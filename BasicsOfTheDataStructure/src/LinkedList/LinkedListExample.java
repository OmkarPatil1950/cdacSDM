package LinkedList;

import java.io.IOException;
import java.lang.invoke.StringConcatFactory;

public class LinkedListExample {

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

//		myLinkedList.show();
		//myLinkedList.searchByLength(1);
		
		//kite k7=new kite("darkRed", "Manish", 17, true);

	//	myLinkedList.addAtBegining(k7);
		
    // myLinkedList.show();
		
	//myLinkedList.searchByTheOwnerName("virat");
		
		//myLinkedList.show();
	//myLinkedList.modifyOwnerName("virat");	
	
	//myLinkedList.show();
	
	//myLinkedList.deleteNodeAtfirstPosition();
	
	//myLinkedList.show();
	
    //myLinkedList.deleteAtlastPosition();
	//myLinkedList.sub();
	//myLinkedList.show();
	//myLinkedList.deleteWithLength(15);
	//myLinkedList.show();
	//myLinkedList.deleteOfOwner("ms");
	//myLinkedList.show();
     //myLinkedList.deleteObject(k1);
     myLinkedList.show();
    myLinkedList.insertWithName("KL", k6);
     myLinkedList.show();
	}
}
class myLinkedListContainer{
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
	void addAtBegining(kite newKite) {
		newKite.next=start;
		start=newKite;
		System.out.println("\n====>The node is addeed sucessfully.....\n");
	}
	void searchByTheOwnerName(String name) {
		if(start==null) {
			System.out.println("\nThe List in empty.....\n");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.owner==name) {
					System.out.println("\nThe owner of the kite is founded ..........\n"+ptr);
				}
				ptr=ptr.next;
			}
		}
	}
	void modifyOwnerName(String ownerNameToModify) {
		if(start==null) {
			System.out.println("The List is Empty...........");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.owner==ownerNameToModify) {
					ptr.owner="RunMachine";
					System.out.println("The Modified Name -"+ptr.owner);
					break;
				}
				ptr=ptr.next;
			}
			
		}
	}
	void deleteNodeAtfirstPosition() {
		System.out.println("Deleting the node .......");
		ptr=start;
		start=ptr.next;
		ptr=start;
		
	}
	void deleteAtlastPosition() {
		System.out.println("Deleting from last position .......");
		ptr=start;
		pre=ptr.next;
		while(ptr!=null) {
			ptr=ptr.next;	
		}
		System.out.println("Deleted.....");
		pre.next=ptr;
		
		
	}
	void deleteWithLength(int lengthToDelete) {
		int count=0;
		if(start==null) {
			System.out.println("The list is empty in the delete with length......");
		}
		else {
			//System.out.println("Hii");
			ptr=start;
		while(ptr!=null) {
			 //count=0;
			if(ptr.length==lengthToDelete) {
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
			count++;
			pre=ptr;
			ptr=ptr.next;
			
		}
		}
		
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
	void insertWithName(String ownerToFind,kite newKite) {
		boolean found=false;
		int count=0;
		if(start==null) {
			System.out.println("The list is empty .......can't insert.");
		}
		else if(start.owner.equals(ownerToFind)){
			addAtBegining(newKite);
		}
		
		else {
			ptr=start;
			pre=ptr;
			while(ptr!=null) {
				if(ptr.owner.equals(ownerToFind)) {
					found=true;
					count++;
					break;
				}
				pre=ptr;
				ptr=ptr.next;
			}
			if(found==true) {
				pre.next=newKite;
				newKite.next=ptr;
				System.out.println("Inserted sucessfully.....");
				
			}
		}
		System.out.println("The no.of kites are "+count);
	}
}

