package LinkedList;

public class Car {
	String name;
	String model;
	int price;
	int CC;
	Car next;
	
	public Car(String name, String model, int price, int cC) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		CC = cC;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + ", CC=" + CC + "]";
	}
	

}
