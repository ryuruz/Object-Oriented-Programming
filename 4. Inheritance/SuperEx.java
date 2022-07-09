class Pointc{
	private int x, y;
	public Pointc() {
		this.x = this.y = 0;
	}

	public Pointc(int x, int y) {
		this.x = x; this.y = y;
	}

	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class CP extends Pointc{
	private String color;
	public CP(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showCP() {
		System.out.print(color);
		showPoint();
	}
}

public class SuperEx {
	public static void main(String[] args) {
		CP cp = new CP(5, 6, "blue");
		cp.showCP();
	}

}
