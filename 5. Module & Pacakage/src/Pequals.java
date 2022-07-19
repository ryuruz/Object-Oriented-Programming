class Point1{
	int x, y;
	public Point1(int x, int y) {
		this.x = x; this.y=y;
	}
	public boolean equals(Object obj) {
		Point1 p = (Point1) obj;
		if(x==p.x && y==p.y) return true;
		else return false;
	}
}

public class Pequals {
	public static void main(String[] args) {
		Point1 a = new Point1(1,3);
		Point1 b = new Point1(1,3);
		
		System.out.println(a.equals(b));
		}

}
