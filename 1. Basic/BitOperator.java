public class BitOperator {

	public static void main(String[] args) {
		// short는 2바이트
		short a = (short)0x55ff; //5는 0101 f는 15 1111 -> 0101 0101 1111 1111
		short b = (short)0x00ff; // 0000 0000 1111 1111
		
		//비트 논리 연산
		System.out.println("[비트 연산 결과]");
		///0x면 16진수인데 4가 앞에 -> 4자리로 출력하고 빈자리 0으로 채우라는 뜻
		System.out.printf("%04x\n", (short)(a&b)); // 0000 0000 1111 1111 -> 00ff
		System.out.printf("%04x\n", (short)(a|b)); // 0101 0101 1111 1111 -> 55ff
		System.out.printf("%04x\n", (short)(a^b)); // 0101 0101 0000 0000 -> 5500
		System.out.printf("%04x\n", (short)(~a)); // 1010 1010 0000 0000 -> aa00
	
		byte c = 20; // 0000 0000 0000 0000 0000 0000 0001 0100, 0x00000014
		byte d = -8; // 1111 1111 1111 1111 1111 1111 1111 1000, 0xfffffff8
		
		//비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2); // 0101 0000 : 80
		System.out.println(c>>2); // 0000 0101 : 5	
		System.out.println(d>>2); // 1111 1111 1111 1100 -> 1111 1111 1111 1110 : 254 : 128+126 : -2
		System.out.printf("%x\n", (d>>>2)); // 0011 1111 1111 1111 1111 1111 1111 1110 : 3ffffffe
		
	
	}

}
