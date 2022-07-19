public class Stringex {

	public static void main(String[] args) {
		String a = "abcd";
		char data[] = {'a','b','c','d'};
		String b = new String(data);
		String c = new String(a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		
		
	}

}
