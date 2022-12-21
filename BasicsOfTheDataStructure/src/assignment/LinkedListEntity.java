package assignment;
public class LinkedListEntity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kite k1=new kite("pink", "virat", 18, true);
		kite k2=new kite("yellow", "raina", 03, true);
		kite k3=new kite("Black", "KL", 1, true);
		
		System.out.println(k1);//print only k1 without list
		System.out.println(k2);
		System.out.println(k3);
		
		
		System.out.println("\nPrinting HashCode \nk1:"+k1.hashCode()+"\nk2:"+k2.hashCode()+"\nk3:"+k3.hashCode());
		
		k1.next=k2;
		k2.next=k3;
		k3.next=null;
		
		System.out.println("printing a list ");
		System.out.println(k1);
		
		System.out.println("\nprinting the hascode and adresss containing in the next");
		System.out.println(k1.next.hashCode());
		System.out.println(k2.next.hashCode());
		if(k3.next!=null)
		System.out.println(k3.next.hashCode());
	}

}
class kite{
	String color;
	String owner;
	int length;
	boolean flying;
	
	kite next;

	public kite(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
		
	}

	@Override
	public String toString() {
		return "kite [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ", next="
				+ "]";
	}
	
	
	
}
