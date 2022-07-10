import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		int flag = 0;
		int List[] = {0,0,0,0,0,0,0,0,0,0};
		
		while (flag == 0) {
			System.out.println("좌석을 예약하시겠습니까? ");
			System.out.print("예약하시려면 1, 종료하시려면 2를 눌러주세요. >> ");
			
			Scanner scan = new Scanner(System.in);
			int CHOICE = scan.nextInt();
		
			switch (CHOICE) {
			case 1:
				System.out.println("현재 좌석정보는 다음과 같습니다. (빈 좌석 : 0, 이미 예약된 좌석 : 1) ");
				System.out.print("좌석 번호 : 0 1 2 3 4 5 6 7 8 9 \n현재 좌석 : ");
				for (int i=0; i<List.length; i++) 
					System.out.print(List[i]+" ");
				
				System.out.print("\n원하시는 좌석 번호를 입력하세요. >> ");
				int want = scan.nextInt();
				
				if (want > 9) {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				
				if (List[want] == 1)
					System.out.println("이미 예약된 좌석입니다. 처음으로 돌아갑니다.");
				else {
					List[want] = 1;
					System.out.println("예약이 완료되었습니다. \n");
				}		
				break;
				
			case 2:
				flag = 1;
				scan.close();
				break;
			default:
				System.out.print("잘못 입력하셨습니다. 다시 입력하세요");
			}
		}
	}

}
