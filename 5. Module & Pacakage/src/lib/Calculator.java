package lib;

public abstract class Calculator { // 다른 패키지(app)의 클래스에서 접근할 수 있도록 접근지정자 public으로 선언
	public abstract int add(int a, int b);
	public abstract int substract(int a, int b);
	public abstract double average(int [] a);

}
