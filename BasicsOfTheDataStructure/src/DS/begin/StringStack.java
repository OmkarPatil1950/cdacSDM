package DS.begin;
public class StringStack {
	public static void main(String[] args) {
		StringStackExampel TheStack= new StringStackExampel(3);
		System.out.println(TheStack.push("India"));
		System.out.println(TheStack.push("Perth"));
		System.out.println(TheStack.push("Sydny"));
		System.out.println(TheStack.pop());
		System.out.println(TheStack.peek());

	}
}
class StackfullException extends RuntimeException {
	StackfullException(String errmsg){
		super(errmsg);
	}
}
class StringStackExampel{
	String Country[];
	int index=0;
	int size=0;
	public StringStackExampel(int size) {
		this.size=size;
		Country = new String [size];
	}
	String push(String CountryToPop){
		if(index >size-1)
		{
			System.out.println("The Stack is full.....");
			throw new StackfullException("The Stack is full.....");
		}
		System.out.println("Adding into the stack.....");
		return Country[index++]=CountryToPop;
	}
	String pop(){
		if(index < 0)
		{
			throw new StackfullException("The Stack is Empty.....");
		}
		System.out.println("removing from the stack.....");
		return Country[--index];
	}
	String peek(){
		if(index < 0)
		{
			throw new StackfullException("The Stack is Empty.....");
		}
		System.out.println("reading from the stack.....");
		return Country[--index];
	}
}