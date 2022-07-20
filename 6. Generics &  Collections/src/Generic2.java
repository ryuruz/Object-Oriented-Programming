import java.util.*;

public class Generic2 {

	public static void main(String[] args) {
		
		//ArratList : ���ͺ��� ���� �� ����
		System.out.println("4. ArrayList<String>");
		var array = new ArrayList<String>(); 
		array.add("Hello"); array.add("Hi"); array.add("Java"); System.out.println(array);
		System.out.println("arrayList�� ������: "+array.size()); 
		array.add(3, "World"); System.out.println(array); 
		array.set(2,"Computer"); System.out.println(array); 
		array.clear(); System.out.println(array);
		 
		// ���ڿ��� �Է¹޾� �����ϰ� ���� �� �̸� ����ϱ�
		
		Scanner scan = new Scanner(System.in); 
		var name = new ArrayList <String>();
		for (int i = 0; i<4; i++) { 
			 System.out.print("�̸��� �Է��ϼ���>> "); 
			 String n = scan.next(); 
			 name.add(n); 
		} 
		int howLong = 0; int index=0; 
		for (int i = 0; i<4; i++) { 
			 String nameI = name.get(i); 
			 if (howLong < nameI.length()) 
				 index = i; 
		} 
		System.out.println("���� �� �̸��� "+name.get(index));
		 
		
		//iterator() ȣ�� �� �ε��� ���̵� ��ü ������ Ž�� ����
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
		System.out.println("��� ���Ͱ��� ���� "+sum);
		
		//��ó�� for������ �����ϴٰ��� for�� ������ ���� �� ������ �ε��� ������ ��Ȯ���� ���� �� ����
		//iter �̿��Ͽ� ���� �� ����
		var minus = new Vector<Integer>();
		minus.add(-1); minus.add(3); minus.add(0); minus.add(-4); minus.add(-9); System.out.println(minus);
		var Iter = minus.iterator();
		while(Iter.hasNext()) {
			int m = Iter.next();
			if (m<0)
				Iter.remove(); // ���������� ���ϵ� ��� ����
		}
		System.out.println("���: "+minus);
		
		scan.close();
		
	}

}
