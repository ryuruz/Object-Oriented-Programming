class Rect{
	int width, height;
	public Rect(int width, int height) {
		this.width = width; 
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rect r = (Rect) obj;
		if (width*height == r.width*r.height) return true;
		else return false;
	}
}

public class RectEquals {
	public static void main(String[] args) {
		Rect a = new Rect(3,4);
		Rect b = new Rect(4,3);
		
		System.out.println(a.equals(b));

	}

}
