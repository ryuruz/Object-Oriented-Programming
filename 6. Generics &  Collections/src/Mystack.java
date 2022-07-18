class Gstack<T>{
	int tos;
	Object [] stck;
	public Gstack() {
		tos = 0;
		stck = new Object[10];
	}
	
	public void push(T item) {
		if (tos==10)
			return;
		stck[tos] = item;
		tos++;
	}
	public T pop() {
		if(tos == 0)
			return null;
	    tos--;
	    return (T)stck[tos];
	}
}

public class Mystack {
	public static void main(String[] args) {
		var stringStack = new Gstack<String>();
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for (int n=0; n<3; n++)
			System.out.println(stringStack.pop());
		
		var intStack = new Gstack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for (int n=0; n<3; n++)
			System.out.println(intStack.pop());
		
	}
}
