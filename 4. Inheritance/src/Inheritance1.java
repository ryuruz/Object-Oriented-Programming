class Super{
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Super");
	}
}

class Sub extends Super{
	@Override
	public void paint() {
		draw();
	}
	@Override
	public void draw() {
		System.out.println("Sub");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		
		Super a = new Sub();
		//Sub a = new Sub();
		//Super a = new Super();
		a.paint();
	}

}
