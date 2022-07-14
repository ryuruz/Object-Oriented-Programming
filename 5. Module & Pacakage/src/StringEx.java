public class StringEx {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a+"의 길이는 " + a.length()); // a의 길이는 3
		System.out.println(a.contains("#")); // true
		
		a = a.concat(b); // a = " C#,C++"
		System.out.println(a);
		
		a = a.trim(); // a = "C#,C++"
		System.out.println(a);
		
		a = a.replace("C#", "Java"); // a = "Java,C++"
		System.out.println(a);
		
		String s[] = a.split(","); // s = ["Java", "C++"]
		for (int i=0; i<s.length; i++)
			System.out.println("분리된 문자열"+i+":"+s[i]);
		
		a = a.substring(5); // 5부터 끝까지 분리된 문자열 => a = C++
		System.out.println(a);
		
		char c = a.charAt(2); // 2번째 문자열 c = +, 기본타입이므로 자동 언박싱됨
		System.out.println(c);
	
	}
}
