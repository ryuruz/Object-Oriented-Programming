import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {
		String a = "티니/고양이/통통이/동그라미";
		StringTokenizer b = new StringTokenizer(a, "/");
		while(b.hasMoreTokens())
			System.out.println(b.nextToken());
	}

}
