import java.util.*; 
public class ex7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String S = scan.nextLine();
			if (S.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			StringTokenizer st = new StringTokenizer(S, " ");
			System.out.println("어절 개수는 "+st.countTokens());
		}
		scan.close();
	}
}