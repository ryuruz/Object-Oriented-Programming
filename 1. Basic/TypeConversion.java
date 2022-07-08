
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=127;
		int i=100;
		
		System.out.println(b+i); //227
		System.out.println(10/4); //2
		System.out.println(10.0/4); //2.5
		
		System.out.println((char)0x12340041);
		/*
		0x12340041는 16진수 -> int형 4byte
		char은 2byte 자료형이므로 가장 하위의 2byte만 읽을 수 있다.
		0x0041 = 0x41 = 65
		char(65)는 A
 		*/
		
		System.out.println((byte)(b+i)); // 29
		/*
		127 + 100 -> 먼저 BYTE (127 + 1) = -128 계산 후 남은 99를 더해주면
		-128 + 99 = 29
		*/
		
		System.out.println((int)2.9+1.8); // 3
		System.out.println((int)(2.9+1.8)); // 4
		System.out.println((int)2.9 + (int)1.8); //3
		
	}

}
