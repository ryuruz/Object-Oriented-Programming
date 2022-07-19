class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y=y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
}

public class PtoString {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		// p객체 출력시 toString() 메소드 자동 소환 
		System.out.println(p);
		System.out.println(p+"입니다");
	}

}
