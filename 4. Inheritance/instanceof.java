class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class instanceOfEx {
	static void print(Person p) {
		if (p instanceof Person)
			System.out.print("Person ");
		if (p instanceof Student)
			System.out.print("Student ");
		if (p instanceof Researcher)
			System.out.print("Researcher ");
		if (p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String args){
		System.out.print("new Studenet() -> \t");
		print(new Student());
		System.out.prnt("new Researcher() -> \t");
		print(new Research());
		System.out.prnt("new Professor() -> \t");
		print(new Professor());
	}
}
