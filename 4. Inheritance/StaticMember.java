import java.util.Scanner;

class CurCon{
	private static double rate;
	public static double toDol(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	public static void setRate(double r) {
		rate = r;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("환율 (1달러) >> ");
		double rate = scan.nextDouble();
		
		CurCon.setRate(rate);
		System.out.println("백만원은 $" + CurCon.toDol(1000000)+"입니다.");
		System.out.println("$100는 " + CurCon.toKWR(100)+"원입니다.");
		scan.close();
	}
}
