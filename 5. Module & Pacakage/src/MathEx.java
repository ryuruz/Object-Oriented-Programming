public class MathEx {
	public static void main(String[] args) {
		double a = 3.6;
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a));
		System.out.println(Math.floor(a));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.exp(2));
		System.out.println(Math.round(3.14));
		
		System.out.println("이번주 행운의 번호는 ");
		for (int i=0; i<5; i++)
			System.out.print((int)(Math.random()*45+1)+" ");
		
	}
}
