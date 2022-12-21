package LinkedList;

public class CarLinkedList {
	public static void main(String[] args) {
	Car c1=new Car("BMW","X1",180000,1800);
	Car c2=new Car("jaqurar","j1",810000,3500);
	Car c3=new Car("tata","nexon",801000,4500);
	Car c4=new Car("MG","hector",801000,4500);

	//System.out.println(c1.next);

myLinkedList m1=new myLinkedList();
	m1.add(c1);
	m1.add(c2);
	m1.add(c3);
	//m1.add(c4);
	//m1.show();
	/*m1.addAtFirst(c3);
	m1.show();
	m1.deleteFirst();
	m1.show();*/
	//m1.searchByTheCC(4500);
	//m1.show();
	//m1.modifyTheName("BMW","X1");
	//m1.show();
	//m1.modifyByPrice(801000);
	//m1.show();
	//m1.deleteWithCC(3500);
	//m1.show();
	//m1.deleteFirst1();
	m1.show();
	m1.addAtMiddle(c4,2);
	m1.show();
	}
	
}
class myLinkedList{
	Car start;
	Car ptr;
	Car pre;
	
	void add(Car newNode) {
		if(start==null) {
			System.out.println("Adding first element.....");
			start=newNode;
		}
		else {
			System.out.println("Adding in between ....");
			ptr=start;
			while(ptr!=null) {
				pre=ptr;
				ptr=ptr.next;//null
			}
			pre.next=newNode;
			//newNode.next=null;
			
		}
		
			
		}
	void addAtFirst(Car newNode){
		if(start==null) {
			start=newNode;
		}
		else {
			System.out.println("Added new element at top....");
			newNode.next=start;
			start=newNode;	
		}
		
	}
	void deleteFirst() {
		if(start==null) {
			System.out.println("List is empty.........");
		}
		else {
			ptr=start;
			start=ptr.next;
			ptr=start;
		}
	}
	void show() {
			if(start==null) {
				System.out.println("List is Empty..........");
			}
			else {
				ptr=start;
				while(ptr!=null) {
					System.out.println(ptr);
					ptr=ptr.next;
				}
			}
	}
	 
	void searchByTheCC(int CC) {
		if(start==null) {
			System.out.println("The List is empty......");
		}
		else {
			System.out.println("Searching.......");
			ptr=start;
			while(ptr!=null) {
				if(ptr.CC==CC) {
					System.out.println("Founded........");
					System.out.println(ptr);
				}
				ptr=ptr.next;
			}
			
			
		}
	}
	void modifyTheName(String carName,String modelName) {
		if(start==null) {
			System.out.println("List  is empty......");
		}
		else {
			System.out.println("The name has been changed........");
			ptr=start;
			while(ptr!=null) {
				if(ptr.name==carName && ptr.model==modelName) {
					ptr.name="Tata";
					ptr.model="Tiago";
				}
				ptr=ptr.next;
			}
			
		}
	}
	void modifyByPrice(int newPrice) {
		if(start==null) {
			System.out.println("List is empty.....");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.price==newPrice) {
					ptr.price=45000;
				}
				ptr=ptr.next;
			}
		
		}
		
	}
	void deleteWithCC(int CC) {
		if(start==null) {
			System.out.println("List is empty.....");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				if(ptr.CC==CC) {
					System.out.println("It has been Chanaged...");
				pre.next=ptr.next;
			}
		pre=ptr;
		ptr=ptr.next;
			}
			
		}
	}
	void deleteFirst1() {
		if(start==null) {
			System.out.println("The list is  empty.....");
		}
		else {
			System.out.println("The first element is deleted......");
			ptr=start;
			start=ptr.next;
			ptr=start;
		}
		
	}
	void addAtMiddle(Car newNode,int n) {
		int count=0;
		if(start==null) {
			System.out.println("The list is empty.....");
		}
		else {
			
			System.out.println("List is not empty....");
			ptr=start;
			while(ptr!=null&&count==n) {
				System.out.println("Added sucessfully.....");
				pre.next=newNode;
				newNode.next=ptr.next;
			}
			pre=ptr;
			ptr=ptr.next;
			count++;
			
		}
	}
	
}
