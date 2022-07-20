import java.util.*;
class Student{
	int id;
	String tel;
	public Student(int id,String tel) {
		this.id = id; this.tel = tel;
	}
	public String toString() {
		return "학번: "+id+", 전화번호: "+tel;
	}
}	

public class Generic3 {
	public static void main(String[] args) {
		
//		hash map클래스, 주요 메소드 put&get <k, v>
		System.out.println("5. HashMap<String, String>");
		var h = new HashMap<String, String>();
		h.put("cat", "고양이"); h.put("dog", "강아지");
		h.containsValue("cat"); h.containsKey("cat");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("단어를 입력하세요 >>");
			String input =  scan.next();
			if (input.equals("exit")){
				System.out.println("종료합니다.");
				break;
			}
//			if (h.containsKey(input))
//				System.out.println(h.get(input));
//			else
//				System.out.println("없는 단어입니다.");
			String value = h.get(input);
			if (value == null) System.out.println("없는 단어입니다.");
			else System.out.println(value);
				
		}
		
		var s = new HashMap<String, Integer>();
		s.put("A학생", 96);  s.put("B학생", 97);  s.put("C학생",80);  s.put("D학생",75);  s.put("E학생",90);
		System.out.println("학생의 수는 "+s.size()+"명");
		
		var keys = s.keySet(); System.out.println(keys);
		var iter = keys.iterator();
		
		while(iter.hasNext()) {
			String student = iter.next();
			System.out.println(student+"의 점수는 "+ s.get(student));
		
		var sl = new HashMap<String, Student>();
		sl.put("A학생", new Student(1, "000-111"));
		sl.put("B학생", new Student(2, "555-333"));
		sl.put("C학생", new Student(3, "213-000"));
		
		while(true) {
			System.out.println("이름을 검색하세요 >> ");
			String input = scan.next();
			if (input.equals("exit")) {
				System.out.println("종료");
				break;
			}
			else if (sl.containsKey(input))
				System.out.println(sl.get(input));
			else 
				System.out.println("잘못 입력하셨습니다.");
				
			}
		scan.close();
		}
	}
}

		
