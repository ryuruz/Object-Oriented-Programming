public class AutoBox {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; //오토박싱
		System.out.println("intObject = "+ intObject);
		
		int m = intObject + 10;
		// wrapper 객체 + 기본타입 -> 기본타입 + 기본타입 (오토언박싱)
		System.out.println("m = " + m);
	}

}
