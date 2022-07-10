// 수 맞추기 프로그램
// 랜덤변수 만들기 귀찮아서 그냥 77로

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		System.out.println("수 결정 완료!" );
		
		while (true) {
			System.out.print(i+">> ");
			int a = scan.nextInt();
				if (a !=77) {
					if (a>77)
						System.out.println("\n더 낮게");
					else
						System.out.println("\n더 높게");
				}
				else {
					System.out.println("맞았습니다");
					break;
				}	
			i++;
		}
		scan.close();
	}

}
