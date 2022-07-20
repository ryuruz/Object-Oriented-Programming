import java.util.*;

public class Generic2 {

	public static void main(String[] args) {
		
		//ArratList : 벡터보다 조금 더 빠름
		System.out.println("4. ArrayList<String>");
		var array = new ArrayList<String>(); 
		array.add("Hello"); array.add("Hi"); array.add("Java"); System.out.println(array);
		System.out.println("arrayList의 사이즈: "+array.size()); 
		array.add(3, "World"); System.out.println(array); 
		array.set(2,"Computer"); System.out.println(array); 
		array.clear(); System.out.println(array);
		 
		// 문자열만 입력받아 저장하고 가장 긴 이름 출력하기
		
		Scanner scan = new Scanner(System.in); 
		var name = new ArrayList <String>();
		for (int i = 0; i<4; i++) { 
			 System.out.print("이름을 입력하세요>> "); 
			 String n = scan.next(); 
			 name.add(n); 
		} 
		int howLong = 0; int index=0; 
		for (int i = 0; i<4; i++) { 
			 String nameI = name.get(i); 
			 if (howLong < nameI.length()) 
				 index = i; 
		} 
		System.out.println("가장 긴 이름은 "+name.get(index));
		 
		
		//iterator() 호출 시 인덱스 없이도 객체 순차적 탐색 가능
		var v = new Vector<Integer>();
		int sum = 0;
		v.add(3); v.add(1); v.add(2); v.add(4); System.out.println(v);
		var iter = v.iterator();
//		Iterator<Integer> iter = v.iterator();
		while(iter.hasNext()) {
			int m = iter.next();
			System.out.println(m);
			sum += m;
		}
		System.out.println("모든 벡터값의 합은 "+sum);
		
		//전처럼 for문으로 접근하다가는 for문 내에서 음수 값 삭제시 인덱스 문제로 정확하지 못할 수 있음
		//iter 이용하여 음수 값 제거
		var minus = new Vector<Integer>();
		minus.add(-1); minus.add(3); minus.add(0); minus.add(-4); minus.add(-9); System.out.println(minus);
		var Iter = minus.iterator();
		while(Iter.hasNext()) {
			int m = Iter.next();
			if (m<0)
				Iter.remove(); // 마지막으로 리턴된 요소 제거
		}
		System.out.println("결과: "+minus);
		
		scan.close();
		
	}

}
