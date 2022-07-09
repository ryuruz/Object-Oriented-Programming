class ope {
	public static int abs(int a) {return (a>0)?a:-a;}
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a, int b) {return (a<b)?a:b;}
}	

public class Calc{
	public static void main(String[] args) {
		System.out.println(ope.abs(-5));
		System.out.println(ope.max(10, 8));
		System.out.println(ope.min(-3, -8));
	}
}
