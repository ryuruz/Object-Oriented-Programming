class Point2{
	private int x,y;
	public Point2(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
}
public class ToString {
	public static void main(String[] args) {
		Point2 p = new Point2(2,3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p+"입니다."); // p가 p.string()으로 자동 변환
	}
}
