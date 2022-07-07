
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=127;
		int i=100;
		
		System.out.println(b+i); //227
		System.out.println(10/4); //2
		System.out.println(10.0/4); //2.5
		
		System.out.println((char)0x12340041); // 체크
		System.out.println((byte)(b+i)); // 체크
		
		System.out.println((int)2.9+1.8); // 3
		System.out.println((int)(2.9+1.8)); // 4
		System.out.println((int)2.9 + (int)1.8); //3
		
	}

}
