class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		//weight = 99; weight은 private 변수이므로 접근 불가함
		setWeight(99); //대신 wetWeight 메소드를 통하여 우회적으로 접근
				}
}
public class Inheritance {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();

	}
}
