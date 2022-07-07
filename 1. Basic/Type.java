public class Type {

	public static void main(String[] args) {
		System.out.println((byte)(128+128)+ (int)22.9);
		
		/* 정수 256을 byte에 대입시 1000 0000 으로 0, int 22.9는 22
		따라서 22 리턴
		*/
		
		System.out.println((byte)(129));
		// byte범위인 -128~127 넘어감 -> -127로 변환
		
	}

}
