import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector <Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		System.out.println("백터 내의 요소 객체 수 : "+ v.size());
		System.out.println("백터의 현재 용량 : "+ v.capacity());
		
		for (int i = 0;i< v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for (int i = 0;i< v.size(); i++) {
			int n = v.elementAt(i); // get메소드와 elementAt메소드 모두 i번째 요소 리턴으로, 동일한 메소드
			sum += n;
		}
		System.out.println("백터에 있는 정수 합 : " + sum);
		
	}
}
