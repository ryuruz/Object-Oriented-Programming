import java.util.*;

public class HashEx {

	public static void main(String[] args) {
		var dic = new HashMap<String, String>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��? >> ");
			String eng = scan.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�");
				break;
			}
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng+"�� ���� �ܾ��Դϴ�. \n");
			else
				System.out.println("�Է��Ͻ� �ܾ�� \""+kor+"\"�Դϴ�. \n");
			
		}
		scan.close();
	}

}
