class Circle{
	int rad;
	public Circle(int rad) {this.rad = rad;}
	public double getArea() {return 3.14*rad*rad;}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5];
		
		for (int i=0; i<c.length; i++) {
			c[i] = new Circle(i); // 각 배열의 원소 객체 생성 -> 인덱스값의 반지름을 갖는다
			System.out.println((int)c[i].getArea());
		}
	}

}