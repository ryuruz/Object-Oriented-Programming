public class StringBuf {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil"); // 덧붙임
		System.out.println(sb);
		/*
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
		T h i s   i s   p e n  c  i  l
		*/
		sb.insert(7, " my"); // 7번째(p 앞 공백)에 삽입
		System.out.println(sb);
		/*
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
		T h i s   i s   m y    p  e  n  c  i  l
		*/
		sb.replace(8, 10, "your"); //8부터 9까지의 "my"를 your로 변경
		System.out.println(sb);
		/*
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
		T h i s   i s   y o u  r     p  e  n  c  i  l
		*/
		
		sb.delete(8, 13); // 8부터 12까지의 "your " 삭제
		System.out.println(sb);
		/*
		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
		T h i s   i s   p e n  c  i  l
		*/
		
		sb.setLength(4); //문자열 길이를 4(0-3)로 수정
		System.out.println(sb);
	}

}
