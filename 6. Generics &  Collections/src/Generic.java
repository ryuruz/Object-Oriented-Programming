import java.util.*;
class Point{
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return ("("+x+","+y+")");
	}
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if (x == p.x && y ==p.y) return true;
		else return false;
	}
}
public class Generic {
	public static void printV(Vector <Integer> v) {
		for (int index = 0; index<v.size(); index++) {
			int n = v.get(index);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		System.out.println("1. Stack<String>");
		Stack <String> myStack = new Stack<String>();
		myStack.push("1st"); System.out.println(myStack);
		myStack.push("2nd"); System.out.println(myStack);
		myStack.pop(); System.out.println(myStack);
		//System.out.println(myStack(1));
		
		System.out.println("\n\n2. Vector<Integer>");
		Vector <Integer> v = new Vector<Integer>();
		// Vector <Integer> v = new Vector<>();
		// var v = new Vector<Integer>();
		v.add(1); System.out.println(v);
		v.add(3); System.out.println(v);
		v.add(1, 2); System.out.println(v);
		int n = v.size(); int c= v.capacity();
		Integer obj = v.get(2);
		int i = obj.intValue();
		System.out.println("v 사이즈: "+n+", v 용량: "+c+", index 2의 요소: "+i);
		
		//모든 요소 정수 출력하기 
		System.out.println("벡터 속 모든 정수 출력하기");
		int sum = 0;
		for (int a=0; a<v.size(); a++) {
			int element = v.get(a);
			sum += element;
			System.out.println(element);
		}
		System.out.println("벡터 속 모든 정수의 합은 "+sum);
		printV(v);
		
		// 포인트 클래스를 다루는 벡터 컬렉션
		System.out.println("\n\n3. Vector<Point>");
		var PV = new Vector<Point>();
		Point p = new Point(3,4);
		PV.add(p);	System.out.println(PV);
		PV.add(new Point(2,5)); System.out.println(PV);
		PV.add(new Point(4,6)); System.out.println(PV);
		PV.remove(1); System.out.println(PV);
		System.out.println(PV.contains(p));
		System.out.println(PV.contains(new Point(3,4)));
		System.out.println("벡터 속 모든 포인트 출력하기");
		for (int a=0; a<v.size(); a++) {
			Point element = PV.get(a);
			System.out.println(element);
		} 
	}

}
