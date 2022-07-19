public class RandomEx {
	public static void main(String[] args) {
		//0.0 이상 1.0 미만의 임의의 double 값
		//1부터 45사이 랜덤 값 9개 뽑기
		int lotto[] = new int[9];
		for(int a = 0; a<9; a++) {
			lotto[a] = (int)(1+45*Math.random());
			System.out.println(a+1+"번째 번호 >> "+lotto[a]);
		}
	}

}
