import java.util.*;
class Student{
	int id;
	String tel;
	public Student(int id,String tel) {
		this.id = id; this.tel = tel;
	}
	public String toString() {
		return "�й�: "+id+", ��ȭ��ȣ: "+tel;
	}
}	

public class Generic3 {
	public static void main(String[] args) {
		
//		hash mapŬ����, �ֿ� �޼ҵ� put&get <k, v>
		System.out.println("5. HashMap<String, String>");
		var h = new HashMap<String, String>();
		h.put("cat", "�����"); h.put("dog", "������");
		h.containsValue("cat"); h.containsKey("cat");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("�ܾ �Է��ϼ��� >>");
			String input =  scan.next();
			if (input.equals("exit")){
				System.out.println("�����մϴ�.");
				break;
			}
//			if (h.containsKey(input))
//				System.out.println(h.get(input));
//			else
//				System.out.println("���� �ܾ��Դϴ�.");
			String value = h.get(input);
			if (value == null) System.out.println("���� �ܾ��Դϴ�.");
			else System.out.println(value);
				
		}
		
		var s = new HashMap<String, Integer>();
		s.put("A�л�", 96);  s.put("B�л�", 97);  s.put("C�л�",80);  s.put("D�л�",75);  s.put("E�л�",90);
		System.out.println("�л��� ���� "+s.size()+"��");
		
		var keys = s.keySet(); System.out.println(keys);
		var iter = keys.iterator();
		
		while(iter.hasNext()) {
			String student = iter.next();
			System.out.println(student+"�� ������ "+ s.get(student));
		
		var sl = new HashMap<String, Student>();
		sl.put("A�л�", new Student(1, "000-111"));
		sl.put("B�л�", new Student(2, "555-333"));
		sl.put("C�л�", new Student(3, "213-000"));
		
		while(true) {
			System.out.println("�̸��� �˻��ϼ��� >> ");
			String input = scan.next();
			if (input.equals("exit")) {
				System.out.println("����");
				break;
			}
			else if (sl.containsKey(input))
				System.out.println(sl.get(input));
			else 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				
			}
		scan.close();
		}
	}
}

		
