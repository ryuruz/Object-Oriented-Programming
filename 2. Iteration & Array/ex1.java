// 3, 6, 9 숫자를 하나 포함하면 박수짝
// 두개 포함하면 박수 짝짝

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		
		int a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력(1~99)>>>");
		a = scan.nextInt();
		
		int a10 = a/10;
		int a1 = a%10;
		
		if (a10 % 3 == 0) {
			if (a1 % 3 == 0)
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		}
		else if (a1 % 3 == 0) {
			if (a10 % 3 == 0)
				System.out.println("박수짝짝");
			else	
				System.out.println("박수짝");
		}
			
		scan.close();
	}

}
