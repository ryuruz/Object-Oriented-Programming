import java.util.Scanner;
abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String srcString(); // 추상 메소드
	abstract protected String destString(); // 추상 메소드
	protected double ratio; // 비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() + "입니다");
		scanner.close();
	}
}

public class Won2Dollar extends Converter{
	protected double convert(double src){
		return src*ratio;
	}
	protected String srcString() {return "원";}
	protected String destString() {return "달러";}
	public Won2Dollar(double ratio){
		this.ratio = 1/ratio;
	}

		
	public static void main(String[] args) {
	Won2Dollar toDollar = new Won2Dollar(1200);
	toDollar.run();
	}
}
