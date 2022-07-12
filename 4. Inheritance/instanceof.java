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
			System.out.print("Person ");
	}

}
