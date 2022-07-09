public class GarbageEx {

	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e;
		
		a = null; // String "Good" 이 가비지가 된다
		d = c; 
		c = null; // 위 코드에서 String "Normal"에 레퍼런스. 가비지 x 
	}

}
