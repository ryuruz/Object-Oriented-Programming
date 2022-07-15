class Point1{
	private int x,y;
	public Point1(int x, int y) {
		this.x = x; this.y = y;
	}
}
// Object 클래스로 객체의 속성을 알아내자

public class ObjectProp {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // 현 객체의 런타임 클래스
		System.out.println(obj.hashCode()); // 현 객체에 대한 해시 코드값
		System.out.println(obj.toString()); // 현 객체에 대한 문자열 표현
		System.out.println(obj); 
	}
	public static void main(String[] args) {
		Point1 p = new Point1(2,3);
		print(p);
	}
}
