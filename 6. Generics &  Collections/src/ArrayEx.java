import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		var a = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String s = scan.next();
			a.add(s);
		}
		
		for (int i=0; i<4; i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		int longestIndex = 0;
		for (int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n���� �� �̸��� : " + a.get(longestIndex));
		scan.close();
	}
	
}
