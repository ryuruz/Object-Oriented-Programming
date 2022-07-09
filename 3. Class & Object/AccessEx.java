class Sample{
	public int a;
	private int b;
	int c;
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10; // public이므로 접근 가능
		aClass.b = 10; // private이므로 다른 클래스라 접근 불가능
		aClass.c = 10; // default이므로 같은 클래스 내 접근 가능
	}

}
