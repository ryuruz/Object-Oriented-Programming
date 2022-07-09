class Point{
	private int x,y;
	public void set(int x, int y) {
		this.x = x; this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); // Point 객체 p 생성
		p.set(1,2); 
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3,4); //ColorPoint의 부모 클래스인 Point의 메소드인 set사용
		cp.setColor("red");
		cp.showColorPoint();	
	}
}
